package com.springboot.jpa.relations.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
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

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public ClientDetails(boolean premium, Integer points) {
        this.premium = premium;
        this.points = points;
    }

    @Override
    public String toString() {
        return "ClientDetails{" +
                "id=" + id +
                ", premium=" + premium +
                ", points=" + points +
                '}';
    }
}
