package com.springboot.webflux.controllers;

import com.springboot.webflux.models.dao.ProductoDao;
import com.springboot.webflux.models.documents.Producto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Controller
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoDao productoDao;
    private static final Logger log = LoggerFactory.getLogger(ProductoController.class);

    @GetMapping({"/listar", "/"})
    public String listar(Model model) {
        Flux<Producto> productos = productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        });

        productos.subscribe(prod -> log.info(prod.getNombre()));

        model.addAttribute("productos", productos);
        model.addAttribute("titulo", "Listado de productos");

        return "listar";
    }

    @GetMapping("/listar-data")
    public String listarDataDriven(Model model) {
        Flux<Producto> productos = productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        }).delayElements(Duration.ofSeconds(1));

        productos.subscribe(prod -> log.info(prod.getNombre()));

        model.addAttribute("productos", new ReactiveDataDriverContextVariable(productos, 2));
        model.addAttribute("titulo", "Listado de productos");

        return "listar";
    }

    @GetMapping("/listar-full")
    public String listarFull(Model model) {
        Flux<Producto> productos = productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        }).repeat(5000);

        model.addAttribute("productos", productos);
        model.addAttribute("titulo", "Listado de productos");

        return "listar";
    }

    @GetMapping("/listar-chunked")
    public String listarChunked(Model model) {
        Flux<Producto> productos = productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        }).repeat(5000);

        model.addAttribute("productos", productos);
        model.addAttribute("titulo", "Listado de productos");

        return "listar-chunked";
    }
}
