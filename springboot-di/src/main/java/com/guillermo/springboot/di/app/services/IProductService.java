package com.guillermo.springboot.di.app.services;

import com.guillermo.springboot.di.app.models.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
}
