package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "salidas")
public class Salidas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalida;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    @Column(length = 60, nullable = false)
    private String destino;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_patron_barco"))
    private Patron p1;
    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false, foreignKey = @ForeignKey(name = "FK_salidas_barcos"))
    private Barcos b1;
}
