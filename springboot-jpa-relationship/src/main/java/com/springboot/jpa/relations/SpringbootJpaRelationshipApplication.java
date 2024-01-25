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
        oneToManyInvoiceBidireccional();
    }

    @Transactional
    public void oneToManyInvoiceBidireccional() {
//        al ser bidireccional deben asignar a ambos lados, quien pertenece a quien
        Client client = new Client("Frank", "Cortez");

        Invoice invoice = new Invoice("rental", 435L);
        Invoice invoice1 = new Invoice("san valentin", 545L);
        Invoice invoice2 = new Invoice("Birthday", 987L);

        client.setInvoices(Arrays.asList(invoice,invoice1,invoice2));

        invoice1.setClient(client);
        invoice1.setClient(client);
        invoice2.setClient(client);

        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void removeAddressFindById() {
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address = new Address("Miraflores", 1014);
            Address address1 = new Address("Victor Larco", 345);

            client.setAddresses(Arrays.asList(address, address1));

            clientRepository.save(client);

            System.out.println(client);

//            Optional<Client> optionalClient1 = clientRepository.findById(2L);
            Optional<Client> optionalClient1 = clientRepository.findOne(2L); //este metodo ya no usa carga perezosa, sino trae los objetos enteros en una consulta
            optionalClient1.ifPresent(cli -> {
                cli.getAddresses().remove(address1);
                clientRepository.save(cli);
                System.out.println(cli);
            });
        });
    }

    @Transactional
    public void removeAddress() {
        Client client = new Client("Frank", "Cortez");

        Address address = new Address("Miraflores", 1014);
        Address address1 = new Address("Victor Larco", 345);

        client.setAddresses(List.of(address, address1));

        clientRepository.save(client);

        System.out.println(client);

        Optional<Client> optionalClient = clientRepository.findById(3L);
        optionalClient.ifPresent(cli -> {
            cli.getAddresses().remove(address1);
            clientRepository.save(cli);
            System.out.println(cli);
        });
    }

    @Transactional
    public void oneToManyFindById() {
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address = new Address("Miraflores", 1014);
            Address address1 = new Address("Victor Larco", 345);

            client.setAddresses(Arrays.asList(address, address1));

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
