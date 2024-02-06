package com.corenetworks.madurezRestFull.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="consultas_medicas")
public class ConsultaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;
    private LocalDate fecha;
    private LocalTime hora;

}
