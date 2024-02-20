package com.springboot.webflux.controllers;

import com.springboot.webflux.models.dao.ProductoDao;
import com.springboot.webflux.models.documents.Producto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoRestController {
    private final ProductoDao productoDao;
    private static final Logger log = LoggerFactory.getLogger(ProductoRestController.class);

    @GetMapping()
    public Flux<Producto> index() {
        return productoDao.findAll().map(producto -> {
            producto.setNombre(producto.getNombre().toUpperCase());
            return producto;
        }).doOnNext(prod -> log.info(prod.getNombre()));
    }

    @GetMapping("/{productId}")
    public Mono<Producto> show(@PathVariable String productId) {
        Mono<Producto> producto = productoDao.findById(productId); // forma sencilla

//        Flux<Producto> productos = productoDao.findAll();   // forma mas compleja
//        Mono<Producto> producto = productos
//                .filter(p -> p.getProductId().equals(productId))
//                .next()
//                .doOnNext(prod -> log.info(prod.getNombre()));;

        return producto;
    }
}
