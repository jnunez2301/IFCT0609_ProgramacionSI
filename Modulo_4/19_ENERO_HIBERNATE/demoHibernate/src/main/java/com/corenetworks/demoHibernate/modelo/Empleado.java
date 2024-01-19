package com.corenetworks.demoHibernate.modelo;

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
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  idEmpleado;
    @Column(length = 60, nullable = false)
    private String nombreEmpleado;
    @Column(nullable = false)
    private int edad;

    // 1 a N
    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "FK_centros_privados"))
    private Departamento d1;
}
