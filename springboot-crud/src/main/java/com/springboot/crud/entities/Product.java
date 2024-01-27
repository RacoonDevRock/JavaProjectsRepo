package com.springboot.crud.entities;

import com.springboot.crud.validation.IsExistsDB;
import com.springboot.crud.validation.IsRequired;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
//    @NotBlank(message = "{NotBlank.product.name}") // OPTIONAL
    @IsRequired(message = "{IsRequired.product.name}") // OPTIONAL
    @Size(min = 3, max = 20)
    private String name;

    @Min(500)
//    @NotNull
    @NotNull(message = "{NotNull.product.price}") // OPTIONAL
    private Integer price;

//    @NotBlank
//    @NotBlank(message = "{NotBlank.product.description}") // OPTIONAL
    @IsRequired
    private String description;

    @IsRequired
    @IsExistsDB
    private String sku;
}
