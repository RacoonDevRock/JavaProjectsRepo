package com.guillermo.springboot.di.app.services;

import com.guillermo.springboot.di.app.models.Product;
import com.guillermo.springboot.di.app.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements IProductService {

    private final IProductRepository iProductRepository;

    public ProductServiceImpl(@Qualifier("productRepositoryImpl") IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository
                .findAll()
                .stream()
                .map(product -> {
                    Double priceImp = product.getPrice() * 13.5;
                    Product newProd = (Product) product.clone();
                    newProd.setPrice(priceImp.longValue());
                    return newProd;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return iProductRepository.findById(id);
    }

}
