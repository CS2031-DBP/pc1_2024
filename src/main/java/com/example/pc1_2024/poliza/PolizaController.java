package com.example.pc1_2024.poliza;

import com.example.pc1_2024.dto.PolizaRequest;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poliza")
public class PolizaController {

    @Autowired
    PolizaService polizaService;

    @Autowired
    ModelMapper modelmapper;

    @PostMapping
    ResponseEntity<Poliza> createPoliza(@Valid @RequestBody PolizaRequest newPoliza){
        Poliza poliza = new Poliza();
        modelmapper.map(newPoliza, poliza);

        return ResponseEntity.ok(polizaService.createPoliza(poliza));
    }


}
