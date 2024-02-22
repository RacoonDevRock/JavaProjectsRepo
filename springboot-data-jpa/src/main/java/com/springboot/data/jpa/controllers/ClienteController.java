package com.springboot.data.jpa.controllers;

import com.springboot.data.jpa.models.entity.Cliente;
import com.springboot.data.jpa.paginator.PageRender;
import com.springboot.data.jpa.services.IClienteService;
import com.springboot.data.jpa.services.IUploadFileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@SessionAttributes("cliente")
public class ClienteController {
    private final IClienteService clienteService;
    private final IUploadFileService uploadFileService;
    private final Logger logger = LoggerFactory.getLogger(ClienteController.class);

    @GetMapping(value = "/uploads/{filename:.+}")
    public ResponseEntity<Resource> viewPhoto(@PathVariable String filename) {
        Resource resource = null;
        try {
            resource = uploadFileService.load(filename);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }

    @GetMapping(value = "/view/{clienteId}")
    public String view(@PathVariable(value = "clienteId") Long clienteId, Map<String, Object> model, RedirectAttributes flash) {
        Cliente cliente = clienteService.findOneClient(clienteId);
        if (cliente == null) {
            flash.addFlashAttribute("error", "El cliente no existe en la BD");
            return "redirect:/listar";
        }

        model.put("cliente", cliente);
        model.put("titulo", "Detalle cliente: " + cliente.getNombre());

        return "view";
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {

        Pageable pageRequest = PageRequest.of(page, 5);

        Page<Cliente> clientes = clienteService.findAll(pageRequest);

        PageRender<Cliente> pageRender = new PageRender<>("/listar", clientes);

        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clientes);
        model.addAttribute("page", pageRender);
        return "listar";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String crear(Map<String, Object> model) {
        Cliente cliente = new Cliente();
        model.put("cliente", cliente);
        model.put("titulo", "Formulario de Cliente");
        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(@Valid Cliente cliente, BindingResult bindingResult, Model model, @RequestParam("file") MultipartFile foto, RedirectAttributes flash, SessionStatus sessionStatus) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Cliente");
            return "form";
        }

        if (!foto.isEmpty()) {

            if (cliente.getClienteId() != null && cliente.getClienteId() > 0 && cliente.getFoto() != null && !cliente.getFoto().isEmpty()) {
                uploadFileService.delete(cliente.getFoto());
            }

            String uniqueFilename = null;
            try {
                uniqueFilename = uploadFileService.copy(foto);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            flash.addFlashAttribute("info", "Foto subida correctamente '" + uniqueFilename + "'");

            cliente.setFoto(foto.getOriginalFilename());
        }
        String messageFlash = (cliente.getClienteId() != null) ? "Cliente editado con éxito!" : "Cliente creado con éxito";

        clienteService.save(cliente);
        sessionStatus.setComplete();
        flash.addFlashAttribute("success", "Cliente creado con exito");
        return "redirect:/listar";
    }

    @RequestMapping(value = "/form/{clienteId}", method = RequestMethod.GET)
    public String editar(@PathVariable(value = "clienteId") Long clienteId, Map<String, Object> model, RedirectAttributes flash) {
        Cliente cliente = null;
        if (clienteId > 0) {
            cliente = clienteService.findOneClient(clienteId);
            if (cliente == null) {
                flash.addFlashAttribute("error", "El ID del cliente no existe en la BD");
                return "redirect:/listar";
            }
        } else {
            flash.addFlashAttribute("error", "El ID del cliente no puede ser 0");
            return "redirect:/listar";
        }
        model.put("cliente", cliente);
        model.put("titulo", "Editar cliente");
        return "form";
    }

    @RequestMapping(value = "/eliminar/{clienteId}")
    public String eliminar(@PathVariable(value = "clienteId") Long clienteId, RedirectAttributes flash) {
        if (clienteId > 0) {
            Cliente cliente = clienteService.findOneClient(clienteId);

            clienteService.delete(clienteId);
            flash.addFlashAttribute("success", "Cliente eliminado con exito");

            if (uploadFileService.delete(cliente.getFoto())) {
                flash.addFlashAttribute("info", "Foto " + cliente.getFoto() + " eliminada con éxito...");
            }
        }
        return "redirect:/listar";
    }
}
