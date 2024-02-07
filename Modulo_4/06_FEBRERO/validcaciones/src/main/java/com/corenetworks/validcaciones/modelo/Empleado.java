package com.corenetworks.validcaciones.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(length = 60, nullable = false)
    private String nombreEmpleado;
    @Column(length = 9, nullable = false, unique = true)
    private String dni;
    @Column(nullable = false)
    private double sueldo;
}
