package com.springboot.data.jpa.services.impl;

import com.springboot.data.jpa.models.dao.IClienteDao;
import com.springboot.data.jpa.models.entity.Cliente;
import com.springboot.data.jpa.services.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements IClienteService {
    private final IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return clienteDao.findAll(pageable);
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente findOneClient(Long clienteId) {
        return clienteDao.findById(clienteId).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Long clienteId) {
        clienteDao.deleteById(clienteId);
    }
}
