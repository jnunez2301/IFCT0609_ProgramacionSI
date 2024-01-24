package com.crud.demo.model;


import jakarta.persistence.*;


@Entity
@Table(name = "consulta_analitica_2")

public class ConsultasAnaliticasPK {
    @Id
    @ManyToOne
    @JoinColumn(
            name = "id_consulta_2",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_consulta_analitica_consutlas")
    )
    private Consultas2 consulta;
    @Id
    @ManyToOne
    @JoinColumn(
            name = "id_analitica_2",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_analitica_consulta_consultas")
    )
    private Analiticas2 analitica;

}
