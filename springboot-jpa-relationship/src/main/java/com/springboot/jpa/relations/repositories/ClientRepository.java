package com.springboot.jpa.relations.repositories;

import com.springboot.jpa.relations.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

//    3ra forma para evitar el error del metodo removeAddressesFindById()
    @Query("select c from Client c join fetch c.addresses")
    Optional<Client> findOne(Long id);
}
