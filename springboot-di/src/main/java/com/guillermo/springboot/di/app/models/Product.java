package com.guillermo.springboot.di.app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Cloneable {

    private Long id;
    private String name;
    private Long price;

    @Override
    public Object clone() {    //  Indica que se está anulando (sobreescribiendo) el método clone() heredado de la clase Object.
        try {
            return super.clone();    // Intenta clonar el objeto actual utilizando la implementación predeterminada
                                    // de clone() de la clase Object.
        } catch (CloneNotSupportedException e) {
            return new Product(this.getId(), this.getName(), this.getPrice());  // En caso de que la clase no sea clonable se
                                                                                // crea manualmente un nuevo objeto Product con
                                                                                // los mismos valores que el objeto actual.
        }
    }


}
