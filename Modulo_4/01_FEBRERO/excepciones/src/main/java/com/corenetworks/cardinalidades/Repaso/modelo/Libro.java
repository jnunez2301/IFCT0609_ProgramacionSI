package com.corenetworks.cardinalidades.Repaso.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="libros")
public class Libro {
    @Id
    @Column(length = 20)
    private String isbn;
    @Column(length = 60, nullable = false)
    private String titulo;
    @Column(length = 60, nullable = false)
    private String autor;
    @Column(nullable = false)
    private double precio;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_editorial",
                 nullable = false,
                 foreignKey = @ForeignKey(name="FK_libros_editoriales"))
    private Editorial editorial;

}
