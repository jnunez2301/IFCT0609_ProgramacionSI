package com.crud.demo.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "visitan")
public class Visitas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;
    @Column(nullable = false)
    private LocalDate fechaVisita;
    @ManyToOne
    @JoinColumn(
            name = "dni",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_conductor_visita")
    )
    private Conductores conductores;
    @ManyToOne
    @JoinColumn(
            name = "matricula",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_autobuses_visita")
    )
    private Autobuses autobuses;
    @ManyToOne
    @JoinColumn(
            name = "id_lugar",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_lugares_visita")
    )
    private Lugares lugares;

    public Visitas(LocalDate fechaVisita, Conductores conductores, Autobuses autobuses, Lugares lugares) {
        this.fechaVisita = fechaVisita;
        this.conductores = conductores;
        this.autobuses = autobuses;
        this.lugares = lugares;
    }

    public Visitas() {
    }
}

