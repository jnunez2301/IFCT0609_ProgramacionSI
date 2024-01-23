package com.corenetworks.demoHibernate.modelo.CentrosEducativos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "centros_educativos")
public class CentrosEducativos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
    @Column(length = 60, nullable = false)
    private String direccion;
    @Column(length = 60, nullable = false)
    private String nombre;
    private int integer;

    @OneToOne(
            mappedBy = "c1",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private CentrosPrivados cp1;
}
