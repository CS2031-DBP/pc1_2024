package com.example.pc1_2024.cliente;

import com.example.pc1_2024.poliza.Poliza;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String correo;

    private Tipo tipo;

    private String fecha_i;

    @ManyToMany
    private List<Poliza> polizas;
}
