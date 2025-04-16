package com.example.pc1_2024.dto;

import com.example.pc1_2024.cliente.Tipo;
import com.example.pc1_2024.poliza.Poliza;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ClienteRequest {

    @NotNull
    private String nombre;

    @NotNull
    private String apellido;

    @Email
    @NotNull
    private String correo;

    @NotNull
    private Tipo tipo;

    @Past
    @NotNull
    private Date fecha_i;

    @ManyToMany
    private List<Poliza> polizas;
}
