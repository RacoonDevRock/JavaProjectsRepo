package com.springboot.jpa.relations.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_details")
public class ClientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean premium;
    private Integer points;

//    @OneToOne
//    private Client client;

    public ClientDetails(boolean premium, Integer points) {
        this.premium = premium;
        this.points = points;
    }
}
