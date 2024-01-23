package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patron")
public class Patron {
    @Id
    @Column(length = 9, nullable = false)
    private String dniPatron;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 60)
    private String direccion;

    @OneToMany(
            mappedBy ="p1",
            orphanRemoval = true,
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    List<Salidas> salidas;

    public Patron(String dniPatron, String nombre, String direccion) {
        this.dniPatron = dniPatron;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "dniPatron='" + dniPatron + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", salidas=" + salidas +
                '}';
    }

    public List<Salidas> getSalidas() {
        return salidas;
    }

    public void setSalidas(List<Salidas> salidas) {
        this.salidas = salidas;
    }
}
