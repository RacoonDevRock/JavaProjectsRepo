package com.springboot.app.controller;

import com.springboot.app.entity.Product;
import com.springboot.app.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService;

    @Autowired
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public List<Product> list() {
        return productService.findAll();
    }

    @GetMapping("/{productId}")
    public ResponseEntity<?> view(@PathVariable Long productId) {
        Optional<Product> product = productService.findById(productId);
        if (product.isPresent()) {
            return ResponseEntity.ok(product.orElseThrow());
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/")
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> update(@PathVariable Long productId, @RequestBody Product product) {
        Optional<Product> productOptional = productService.update(productId,product);
        if (productOptional.isPresent()) {
            return new ResponseEntity<>(productOptional.orElseThrow(), HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<?> delete(@PathVariable Long productId) {
        Product product = new Product();
        product.setProductId(productId);
        Optional<Product> productOptional = productService.delete(productId);
        if (productOptional.isPresent()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
