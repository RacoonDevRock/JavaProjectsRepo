package com.application.rest.controllers.dto;

import com.application.rest.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MakerDTO {
    private Long id;
    private String name;    // si yo elimino un creado, eliminado sus productos(no puede haber producto vacio)
    private List<Product> products = new ArrayList<>();
}
