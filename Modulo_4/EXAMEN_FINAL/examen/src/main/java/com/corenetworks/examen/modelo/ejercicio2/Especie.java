package com.corenetworks.examen.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "espcies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60)
    private String nombreVulgar;
    @Column(length = 60, nullable = false, unique = true)
    private String nombreCientifico;
    private boolean extincion;

    @OneToMany(
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            mappedBy = "especie"
    )
    private List<Animal> animales;

}
