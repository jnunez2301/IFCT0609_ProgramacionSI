package com.corenetworks.cardinalidades.Repaso.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class AlumnoProfesorPK implements Serializable {
    @ManyToOne
    @JoinColumn(name="id_profesor", nullable = false, foreignKey = @ForeignKey(name="FK_ap_profesores"))
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name="id_alumno", nullable = false, foreignKey = @ForeignKey(name="FK_ap_alumnos"))
    private Alumno alumno;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlumnoProfesorPK that = (AlumnoProfesorPK) o;
        return Objects.equals(profesor, that.profesor) && Objects.equals(alumno, that.alumno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profesor, alumno);
    }
}
