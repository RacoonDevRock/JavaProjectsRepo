package com.guillermo.springboot.di.app.services;

import com.guillermo.springboot.di.app.models.Product;
import com.guillermo.springboot.di.app.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return repository
                .findAll()
                .stream()
                .peek(product -> {
                    long priceImp = product.getPrice() * (long)13.5;
                    product.setPrice(priceImp);
                }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }

}
