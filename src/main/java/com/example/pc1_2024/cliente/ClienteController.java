package com.example.pc1_2024.cliente;

import com.example.pc1_2024.dto.ClienteRequest;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @Autowired
    ModelMapper modelmapper;

    @PostMapping
    ResponseEntity<Cliente> createCliente(@Valid @RequestBody ClienteRequest newCliente){
        Cliente cliente = new Cliente();
        modelmapper.map(newCliente, cliente);

        return ResponseEntity.ok(clienteService.createCliente(cliente));
    }


}
