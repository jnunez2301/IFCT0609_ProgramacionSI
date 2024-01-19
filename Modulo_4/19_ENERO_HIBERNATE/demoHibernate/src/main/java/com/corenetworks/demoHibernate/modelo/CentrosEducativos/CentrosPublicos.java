package com.corenetworks.demoHibernate.modelo.CentrosEducativos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "centros_publicos")
public class CentrosPublicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 60, nullable = false)
    private String direccion;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int plazas;

    @OneToOne
    @JoinColumn(name = "id_centro", nullable = false, foreignKey = @ForeignKey(name = "FK_centros_publicos"))
    private CentrosEducativos c1;
}
