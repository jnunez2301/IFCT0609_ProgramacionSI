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
@Table(name = "zoos")
public class Zoos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZoo;
    @Column(length = 60)
    private String nombre;
    @Column(length = 50)
    private String pais;
    @Column(length = 50)
    private String ciudad;
    @Column(nullable = false)
    private double tamano;
    @Column(nullable = false)
    private double presupuesto;

    @OneToMany(
            mappedBy = "z1",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    List<Animales> listaAnimales;
}
