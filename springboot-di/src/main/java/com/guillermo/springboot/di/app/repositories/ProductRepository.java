package com.guillermo.springboot.di.app.repositories;

import com.guillermo.springboot.di.app.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L,"memoria 32",456L),
                new Product(2L,"zetus org",354L),
                new Product(3L,"spiderman",123L)
        );
    }

    public  List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(null);
    }

}
