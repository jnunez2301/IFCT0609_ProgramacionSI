package com.corenetworks.madurezRestFull.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    @Column(length = 9, nullable = false, unique = true)
    private String dni;
    @Column(length = 60, nullable = false)
    private String nombre;
}
