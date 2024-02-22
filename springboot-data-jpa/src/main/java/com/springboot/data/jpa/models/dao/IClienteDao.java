package com.springboot.data.jpa.models.dao;

import com.springboot.data.jpa.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
