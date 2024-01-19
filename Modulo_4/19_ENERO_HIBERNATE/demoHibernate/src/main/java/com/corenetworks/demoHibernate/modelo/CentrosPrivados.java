package com.corenetworks.demoHibernate.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="centros_privados")
public class CentrosPrivados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 60, nullable = false)
    private String agrupacion;
    @Column(nullable = false)
    private double precision;

    @OneToOne
    @JoinColumn(name = "id_centro", nullable = false, foreignKey = @ForeignKey(name = "FK_centros_privados"))
    private CentrosEducativos c1;
}
