package com.corenetworks.demoHibernate.modelo.animales;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "especies")
public class Especies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60)
    private String nombreCientifico;
    @Column(length = 60)
    private String nombreVulgar;
    @Column(length = 5)
    private char familia;
    @Column(nullable = false)
    private boolean peligroExtincion;

    @OneToMany(
            mappedBy = "e1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    List<Animales> listaAnimales;
}
