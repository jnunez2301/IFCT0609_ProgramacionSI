package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "barcos")
public class Barcos {
    @Id
    @Column(length = 9, nullable = false)
    private String matricula;
    @Column(length = 60, nullable = false)
    private String amarre;
    @Column(length = 60, nullable = false)
    private String nombre;
    private double cuota;
    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_patron_barco"))
    private Socios s1;

}
