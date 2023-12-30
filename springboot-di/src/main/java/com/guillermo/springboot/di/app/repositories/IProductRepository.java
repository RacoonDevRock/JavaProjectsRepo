package com.guillermo.springboot.di.app.repositories;

import com.guillermo.springboot.di.app.models.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(Long id);
}
