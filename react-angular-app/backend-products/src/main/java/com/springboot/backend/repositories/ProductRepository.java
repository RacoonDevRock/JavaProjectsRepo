package com.springboot.backend.repositories;

import com.springboot.backend.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173/")
@RepositoryRestResource(path = "products")  // http://localhost:8080/products - GET
public interface ProductRepository extends CrudRepository<Product, Long> {
}
