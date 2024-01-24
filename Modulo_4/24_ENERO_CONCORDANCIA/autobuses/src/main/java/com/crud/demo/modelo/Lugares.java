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
@Table(name = "lugares")
public class Lugares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLugar;

    @Column(length = 60, nullable = false)
    private String nombre;

    @OneToMany(
            mappedBy = "lugares",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<Visitas> visitas;

    public Lugares(int idLugar, String nombre) {
        this.idLugar = idLugar;
        this.nombre = nombre;
    }
}