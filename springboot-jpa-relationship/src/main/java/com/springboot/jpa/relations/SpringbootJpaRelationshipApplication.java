package com.springboot.jpa.relations;

import com.springboot.jpa.relations.entities.Address;
import com.springboot.jpa.relations.entities.Client;
import com.springboot.jpa.relations.entities.Invoice;
import com.springboot.jpa.relations.repositories.ClientRepository;
import com.springboot.jpa.relations.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringbootJpaRelationshipApplication implements CommandLineRunner {
    private final ClientRepository clientRepository;
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public SpringbootJpaRelationshipApplication(ClientRepository clientRepository, InvoiceRepository invoiceRepository) {
        this.clientRepository = clientRepository;
        this.invoiceRepository = invoiceRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaRelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        oneToManyFindById();
    }

    @Transactional
    public void oneToManyFindById() {
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address = new Address("Miraflores", 1014);
            Address address1 = new Address("Victor Larco", 345);

            client.setAddresses(Arrays.asList(address,address1));

            clientRepository.save(client);

            System.out.println(client);
        });


    }

    @Transactional
    public void oneToMany() {
        Client client = new Client("Frank", "Cortez");

        Address address = new Address("Miraflores", 1014);
        Address address1 = new Address("Victor Larco", 345);

        client.setAddresses(List.of(address, address1));

        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void manyToOne() {
        Client client = new Client("Thor", "Toe");
        clientRepository.save(client);

        Invoice invoice = new Invoice("comprar de oficina", 250L);
        invoice.setClient(client);
        Invoice invoicedb = invoiceRepository.save(invoice);
        System.out.println(invoicedb);
    }

    @Transactional
    public void manyToOneFindById() {
        Optional<Client> optionalClient = clientRepository.findById(1L);

        if (optionalClient.isPresent()) {
            Client client = optionalClient.orElseThrow();

            Invoice invoice = new Invoice("comprar de oficina", 250L);
            invoice.setClient(client);
            Invoice invoicedb = invoiceRepository.save(invoice);
            System.out.println(invoicedb);
        }

    }
}