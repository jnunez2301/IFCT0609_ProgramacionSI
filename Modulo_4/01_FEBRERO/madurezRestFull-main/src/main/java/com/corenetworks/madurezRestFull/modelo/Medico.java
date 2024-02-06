package com.corenetworks.madurezRestFull.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMedico;
    @Column(length = 10)
    private String colegiado;
    @Column(unique = true, length = 9)
    private String dni;
    private String nombre;
}
