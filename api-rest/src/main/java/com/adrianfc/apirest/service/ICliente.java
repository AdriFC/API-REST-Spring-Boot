package com.adrianfc.apirest.service;

import com.adrianfc.apirest.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
