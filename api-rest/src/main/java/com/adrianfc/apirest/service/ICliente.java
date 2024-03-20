package com.adrianfc.apirest.service;

import com.adrianfc.apirest.model.dto.ClienteDto;
import com.adrianfc.apirest.model.entity.Cliente;

public interface ICliente {

    Cliente save(ClienteDto cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);

}
