package com.application.rest.repository;

import com.application.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

//    ANOTACION QUERY
    @Query("select p from Product p where p.price between ?1 AND ?2")
    List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

//    QUERY METHOD
    List<Product> findProductByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);

}
