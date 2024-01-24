package com.crud.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "analiticas")
public class Analiticas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnalticia;
    @Column(length = 60, nullable = false)
    private String descripcion;
    @Column(length = 5, nullable = false)
    private String sala;
}
