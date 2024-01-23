package com.corenetworks.hibernacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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

}
