package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Lombok
@NoArgsConstructor
@AllArgsConstructor
@Data
// Al ejecutar Spring esto genera la tabla y sus atributos en la BBDD
// JPA
@Entity //jaka persistence
@Table(name="departamentos")
public class Departamento {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(length = 60, nullable = false) // Propiedades para la columna
    private String descripcion;

    //mappedBy = NombreClase
    @OneToMany(
            mappedBy = "d1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    List<Empleado> empleados;


}
