package com.springboot.webflux;

import com.springboot.webflux.models.dao.ProductoDao;
import com.springboot.webflux.models.documents.Producto;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import reactor.core.publisher.Flux;

import java.util.Date;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringbootWebfluxApplication implements CommandLineRunner {
    private final ProductoDao productoDao;
    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;
    private static final Logger log = LoggerFactory.getLogger(SpringbootWebfluxApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebfluxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        reactiveMongoTemplate.dropCollection("productos").subscribe();

        Flux.just(new Producto("TV PANASONIC ", 432.3),
                        new Producto("Wirless motor", 299.9),
                        new Producto("Smartphone", 399.99),
                        new Producto("Laptop", 569.67),
                        new Producto("Tablet", 299.99),
                        new Producto("Smartwatch", 199.99),
                        new Producto("Auriculares inalámbricos", 149.99),
                        new Producto("Cámara digital", 349.99),
                        new Producto("Altavoz inteligente", 7129.99),
                        new Producto("Monitor de computadora", 249.99),
                        new Producto("Impresora multifunción", 199.99)
                )
                .flatMap(producto -> {
                    producto.setCreateAt(new Date());
                    return productoDao.save(producto);
                })
                .subscribe(producto -> log.info("Insert: " + producto.getProductId() + " " + producto.getNombre()));
    }
}
