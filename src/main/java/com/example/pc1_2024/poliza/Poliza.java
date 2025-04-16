package com.example.pc1_2024.poliza;

import com.example.pc1_2024.cliente.Cliente;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Poliza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo_de_seguro;

    private Integer cobertura;

    private Integer monto_asegurado;

    private String vigencia;

    @ManyToMany(mappedBy = "polizas")
    private List<Cliente> clientes;

}
