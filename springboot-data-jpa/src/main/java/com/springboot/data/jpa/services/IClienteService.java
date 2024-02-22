package com.springboot.data.jpa.services;

import com.springboot.data.jpa.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    public void save(Cliente cliente);
    public Cliente findOneClient(Long clienteId);
    public void delete(Long clienteId);
}