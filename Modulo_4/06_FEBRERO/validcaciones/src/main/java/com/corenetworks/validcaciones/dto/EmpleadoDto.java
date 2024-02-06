package com.corenetworks.validcaciones.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpleadoDto {

    private int idEmpleado;

    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombreEmpleado;

    @NotNull
    private String DNI;

    @Min(400)
    @Max(3200)
    private double sueldo;
}
