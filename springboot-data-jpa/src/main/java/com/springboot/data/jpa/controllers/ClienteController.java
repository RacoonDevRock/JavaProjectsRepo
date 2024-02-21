package com.springboot.data.jpa.controllers;

import com.springboot.data.jpa.models.dao.IClienteDao;
import com.springboot.data.jpa.models.entity.Cliente;
import com.springboot.data.jpa.services.IClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

@Controller
@RequiredArgsConstructor
@SessionAttributes("cliente")
public class ClienteController {

    private final IClienteService clienteService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteService.findAll());
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
    public String guardar(@Valid Cliente cliente, BindingResult bindingResult, Model model, SessionStatus sessionStatus) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Cliente");
            return "form";
        }

        clienteService.save(cliente);
        sessionStatus.setComplete();
        return "redirect:/listar";
    }

    @RequestMapping(value = "/form/{clienteId}", method = RequestMethod.GET)
    public String editar(@PathVariable(value = "clienteId") Long clienteId, Map<String, Object> model) {
        Cliente cliente = null;
        if (clienteId > 0) {
            cliente = clienteService.findOneClient(clienteId);
        } else {
            return "redirect:/listar";
        }
        model.put("cliente", cliente);
        model.put("titulo", "Editar cliente");
        return "form";
    }

    @RequestMapping(value = "/eliminar/{clienteId}")
    public String eliminar(@PathVariable(value = "clienteId") Long clienteId) {
        if (clienteId > 0) {
            clienteService.delete(clienteId);
        }
        return "redirect:/listar";
    }
}
