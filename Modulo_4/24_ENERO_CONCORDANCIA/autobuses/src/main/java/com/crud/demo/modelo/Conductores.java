package com.crud.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "conductores")
public class Conductores {
    @Id
    @Column(length = 9)
    private String DNI;
    @Column(length = 60, nullable = false)
    private String nombre;

    @OneToMany(
            mappedBy = "conductores",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private List<Visitas> visitas;

    public Conductores(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }
}
