package com.springboot.jpa.relations.repositories;

import com.springboot.jpa.relations.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

//    3ra forma para evitar el error del metodo removeAddressesFindById()
    @Query("select c from Client c left join fetch c.addresses where c.id=?1")
    Optional<Client> findOneWithAddresses(Long id);

    @Query("select c from Client c left join fetch c.invoices where c.id=?1")
    Optional<Client> findOneWithInvoices(Long id);

    @Query("select c from Client c left join fetch c.invoices left join fetch c.addresses where c.id=?1")
    Optional<Client> findOne(Long id);
}
