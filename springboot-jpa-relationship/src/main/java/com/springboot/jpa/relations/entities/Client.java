package com.springboot.jpa.relations.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;

    //    @JoinColumn(name = "client_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true/*, fetch = FetchType.EAGER*/) // 2da forma, para el metodo removeAddressesFindById()
    @JoinTable(
            name = "table_clients_to_addresses",
            joinColumns = @JoinColumn(name = "id_client"),
            inverseJoinColumns = @JoinColumn(name = "id_addresses"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"id_addresses"}))
    private Set<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "client")
    private Set<Invoice> invoices;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_client_details")
    private ClientDetails clientDetails;

    public Client(String name, String lastName) {
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public void removeInvoice(Invoice invoice) {
        this.getInvoices().remove(invoice);
        invoice.setClient(null);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                ", invoices=" + invoices +
                ", clientDetails=" + clientDetails +
                '}';
    }
}
