package com.guillermo.springboot.di.app.controllers;

import com.guillermo.springboot.di.app.models.Product;
import com.guillermo.springboot.di.app.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

//    INYECTAR DEPENDENICIA MEDIANTE AUTOWIRED
    private final IProductService iProductService;
    @Autowired  // Y CONSTRUCTOR
    public SomeController(IProductService iProductService) {
        this.iProductService = iProductService;
    }
//

    @GetMapping("/")
    public List<Product> list() {
        return iProductService.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return iProductService.findById(id);
    }

}
