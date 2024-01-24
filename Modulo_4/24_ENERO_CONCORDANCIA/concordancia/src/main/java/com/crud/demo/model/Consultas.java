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
@Table(name = "consultas")
public class Consultas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsulta;
    private LocalTime horaConsulta;
    private LocalDate fechaConsulta;

    @ManyToMany
    @JoinTable(
            name = "consultas_analiticas",
            joinColumns = @JoinColumn(
                    name = "id_consulta",
                    referencedColumnName = "idConsulta"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_analitica",
                    referencedColumnName = "idAnalticia"
            )
    )
    private List<Analiticas> analiticas;
}
