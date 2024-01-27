package com.springboot.jpa.relations.repositories;

import com.springboot.jpa.relations.entities.ClientDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDetailsRepository extends CrudRepository<ClientDetails, Long> {
}
