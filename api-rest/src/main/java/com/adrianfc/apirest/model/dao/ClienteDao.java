package com.adrianfc.apirest.model.dao;

import com.adrianfc.apirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {
}
