package com.crud.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "autobuses")
public class Autobuses {
    @Id
    @Column(length = 9)
    private String matricula;
    private LocalDate anioFabricacion;

    @OneToMany(
            mappedBy = "autobuses",
            cascade = CascadeType.ALL,
//            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private List<Visitas> listaVisitas;

    public Autobuses(String matricula, LocalDate anioFabricacion) {
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }
}
