package com.example.pc1_2024.poliza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolizaService {

    @Autowired
    PolizaRepository polizaRepository;

    Poliza createPoliza(Poliza poliza){
        return polizaRepository.save(poliza);
    }

}
