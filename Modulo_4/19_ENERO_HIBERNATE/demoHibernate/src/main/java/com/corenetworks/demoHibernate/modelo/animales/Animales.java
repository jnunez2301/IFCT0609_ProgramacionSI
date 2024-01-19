package com.corenetworks.demoHibernate.modelo.animales;

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
public class Animales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    @Column(length = 1)
    private char sexo;
    @Column(nullable = false)
    private LocalDate anioNacimiento;
    @Column(length = 60)
    private String paisOrigen;
    @Column(length = 60)
    private String continente;

    @ManyToOne
    @JoinColumn(name = "id_especie", nullable = false, foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especies e1;
    @ManyToOne
    @JoinColumn(name = "id_zoo", nullable = false, foreignKey = @ForeignKey(name = "FK_animales_zoos"))
    private Zoos z1;

}
