package com.guillermo.springboot.di.app.repositories;

import com.guillermo.springboot.di.app.models.Product;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L,"memoria 32",456L),
                new Product(2L,"zetus org",354L),
                new Product(3L,"spiderman",123L)
        );
    }

    @Override
    public  List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElseThrow(null);
    }

}
