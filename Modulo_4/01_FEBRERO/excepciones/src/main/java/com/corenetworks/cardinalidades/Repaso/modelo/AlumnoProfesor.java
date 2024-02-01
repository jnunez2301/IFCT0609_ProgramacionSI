package com.corenetworks.cardinalidades.Repaso.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="alumnos_profesores")
@IdClass(AlumnoProfesorPK.class)
public class AlumnoProfesor {
    @Id
    private Alumno alumno;
    @Id
    private Profesor profesor;
}
