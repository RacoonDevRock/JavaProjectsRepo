package com.application.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fabricante")
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;


    @OneToMany(mappedBy = "maker",      // mapeamos con un atributo llamado maker de la clase con la cual tendremo la relacion
            cascade = CascadeType.ALL,  // para que alguna modificacion en maker tmb se de en product
            fetch = FetchType.LAZY,     // para no sobrecargar el listado, cuando obtenga un creador, sino, solo cuando lo necesite
            orphanRemoval = true)       // si yo elimino un creado, eliminado sus productos(no puede haber producto vacio)
    @JsonIgnore
    private List<Product> products = new ArrayList<>();
}
