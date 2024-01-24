package com.crud.demo.model;

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
@Table(name = "consultas2")
public class Consultas2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta2;
    private LocalTime horaConsulta;
    private LocalDate fechaConsulta;
}
