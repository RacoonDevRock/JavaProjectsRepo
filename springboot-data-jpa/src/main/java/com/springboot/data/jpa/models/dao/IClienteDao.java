package com.springboot.data.jpa.models.dao;

import com.springboot.data.jpa.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
