package com.springboot.app.service;

import com.springboot.app.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long productId);
    Product save(Product product);
    Optional<Product> update(Long productId, Product product);
    Optional<Product> delete(Long productId);
}
