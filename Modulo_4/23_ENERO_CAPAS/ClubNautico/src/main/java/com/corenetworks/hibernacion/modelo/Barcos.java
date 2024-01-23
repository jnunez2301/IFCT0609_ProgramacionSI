package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Setter
    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_patron_barco"))
    private Socios s1;

    public Barcos(String matricula, String amarre, String nombre, double cuota) {
        this.matricula = matricula;
        this.amarre = amarre;
        this.nombre = nombre;
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Barcos{" +
                "matricula='" + matricula + '\'' +
                ", amarre='" + amarre + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cuota=" + cuota +
                '}';
    }

    public Socios getS1() {
        return s1;
    }

    public void setS1(Socios s1) {
        this.s1 = s1;
    }
}
