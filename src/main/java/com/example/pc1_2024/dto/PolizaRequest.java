package com.example.pc1_2024.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class PolizaRequest {

    @NotNull
    private String tipo_de_seguro;

    @NotNull
    @PositiveOrZero
    private Integer cobertura;

    @NotNull
    @PositiveOrZero
    private Integer monto_asegurado;

    @NotNull
    private String vigencia;

}
