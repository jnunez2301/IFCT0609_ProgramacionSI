import { Injectable } from '@angular/core';
import { Alumnno } from '../../_modelo/alumno';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class AlumnosService {
  alumnos: Alumnno[] = [
    {
      id: 1,
      nombre: 'Juan',
      apellidos: 'García Pérez',
      horasFormacion: 20,
      mayorDeEdad: true,
    },
    {
      id: 2,
      nombre: 'María',
      apellidos: 'González López',
      horasFormacion: 30,
      mayorDeEdad: false,
    },
    {
      id: 3,
      nombre: 'Ana',
      apellidos: 'Gómez Sánchez',
      horasFormacion: 40,
      mayorDeEdad: true,
    },
  ];

  constructor() {}

  mostrarAlumnos(): Observable<Alumnno[]> {
    return of(this.alumnos);
  }

  buscarAlumno(id: number): Observable<Alumnno> {
    let alumnoEncontrado = this.alumnos.find((alumno) => alumno.id === id);
    return alumnoEncontrado == undefined
      ? of({
          id: 0,
          nombre: '',
          apellidos: '',
          horasFormacion: 0,
          mayorDeEdad: false,
        })
      : of(alumnoEncontrado);
  }

  addAlumnoA(alumno: Alumnno) {
    alumno.id = this.alumnos[this.alumnos.length - 1].id + 1;
    this.alumnos.push(alumno);
  }
  modificarAlumno(alumno: Alumnno) {
    let i = this.alumnos.findIndex((al) => al.id === alumno.id);
    this.alumnos[i] = alumno;
  }
}
