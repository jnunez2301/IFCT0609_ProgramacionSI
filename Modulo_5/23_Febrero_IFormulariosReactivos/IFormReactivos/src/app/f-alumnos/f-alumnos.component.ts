import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Alumnno } from '../../_modelo/alumno';
import { AlumnosService } from '../_servicio/alumnos.service';
import { ActivatedRoute, Router } from '@angular/router'; // Added missing import statements

@Component({
  selector: 'app-f-alumnos',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './f-alumnos.component.html',
  styleUrl: './f-alumnos.component.css'
})
export class FAlumnosComponent implements OnInit{
  form:FormGroup;
  empt_alumno!: Alumnno;
  constructor(private alumnoServicio: AlumnosService, private route: ActivatedRoute, private router: Router) { // Added route and router parameters
    this.form = new FormGroup({
      id: new FormControl(0),
      nombre: new FormControl(''),
      apellidos: new FormControl(''),
      horasFormacion: new FormControl(''),
      mayorDeEdad: new FormControl(false)
    });
  }
  ngOnInit(): void {
    this.route.params.subscribe((data) => { 
      this.alumnoServicio.buscarAlumno(data['id']).subscribe((data) => {
        this.empt_alumno = data;
        this.form = new FormGroup({
          id: new FormControl(this.empt_alumno.id),
          nombre: new FormControl(this.empt_alumno.nombre),
          apellidos: new FormControl(this.empt_alumno.apellidos),
          horasFormacion: new FormControl(this.empt_alumno.horasFormacion),
          mayorDeEdad: new FormControl(this.empt_alumno.mayorDeEdad)
        });
      });
    });    

  }
  addModAlumno(){
    let alumnno: Alumnno = {
      id: this.form.value.id,
      nombre: this.form.value.nombre,
      apellidos: this.form.value.apellidos,
      horasFormacion: this.form.value.horasFormacion,
      mayorDeEdad: this.form.value.mayorDeEdad
    }
    if(alumnno.id == 0){
     this.alumnoServicio.addAlumnoA(alumnno);
    }else{
      this.alumnoServicio.modificarAlumno(alumnno);
    }
    this.router.navigate(['/']);
  }

}
