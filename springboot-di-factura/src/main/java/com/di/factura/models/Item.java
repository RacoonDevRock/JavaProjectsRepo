package com.di.factura.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    //    private Long id;
    private Product product;
    private Integer quantity;

    public int getImport() {
        return quantity * product.getPrice();
    }
}
