package com.example.pc1_2024.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
