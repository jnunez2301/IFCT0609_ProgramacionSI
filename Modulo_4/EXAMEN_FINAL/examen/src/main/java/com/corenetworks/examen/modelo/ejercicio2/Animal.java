package com.corenetworks.examen.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "animales")
public class Animal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    private char Sexo;
    private LocalDate fNacimiento;
    
    @ManyToOne
    @JoinColumn(name = "id_especie", nullable = false, foreignKey = @ForeignKey(name = "FK_animal_especie_animales"))
    private Especie especie;
}
