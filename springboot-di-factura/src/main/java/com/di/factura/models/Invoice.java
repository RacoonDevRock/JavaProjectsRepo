package com.di.factura.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Invoice {
    //    private Long id;
    @Autowired
    private Client client;
    @Value("${invoice.description}")
    private String description;
    @Autowired
    private List<Item> items;
    @PostConstruct
    public void init() {
        System.out.println("Creando el componente de la factura");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destruyendo el componente o bean invoice");
    }

    public int getTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getImport();
        }
        return total;
    }
}
