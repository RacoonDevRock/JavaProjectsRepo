package com.guillermo.springboot.di.app.repositories;

import com.guillermo.springboot.di.app.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Primary
@Repository
public class ProductRepositoryTest implements IProductRepository {
    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"RogsA",600L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id,"RogsA",600L);
    }
}
