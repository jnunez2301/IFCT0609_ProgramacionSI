package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "socios")
public class Socios {
    @Id
    @Column(length = 9, nullable = false)
    private String dniSocio;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 60)
    private String direccion;

    //Solo si lo pide el front se añadirá la notación @OneToMany
    @OneToMany(
            mappedBy = "s1",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            orphanRemoval = true
    )
    private List<Barcos> barcosList;

    public Socios(String dniSocio, String nombre, String direccion) {
        this.dniSocio = dniSocio;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socios{" +
                "dniSocio='" + dniSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", barcosList=" + barcosList +
                '}';
    }

    public List<Barcos> getBarcosList() {
        return barcosList;
    }

    public void setBarcosList(List<Barcos> barcosList) {
        this.barcosList = barcosList;
    }
}