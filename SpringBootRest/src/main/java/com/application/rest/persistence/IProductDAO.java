package com.application.rest.persistence;

import com.application.rest.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IProductDAO {  //recomendado tener una capa de seguridad DAO -
                                // DATA ACCESS OBJECT PARA el trabajo de persistencia de datos
                                // e implementar los metodos necesarios de nuestra aplicacion

    List<Product> findAll();
    Optional<Product> findById(Long id);
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    void save(Product product);
    void deleteById(Long id);

}
