package com.corenetworks.cardinalidades.Repaso.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "editorial",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    private List<Libro> libros;

}
