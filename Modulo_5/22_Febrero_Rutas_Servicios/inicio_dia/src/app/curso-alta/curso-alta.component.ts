import { Component, OnInit } from '@angular/core';
import { Curso, Nivel } from '../_modelo/curso';
import { CursosService } from '../_servicio/cursos.service';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-curso-alta',
  standalone: true,
  imports: [FormsModule, RouterModule],
  templateUrl: './curso-alta.component.html',
  styleUrl: './curso-alta.component.css'
})
export class CursoAltaComponent implements OnInit{
  niveles = Object.values(Nivel);
  curso:Curso = new Curso(0, "", 0, Nivel.INICIACION);
  cursos: Curso[] = [];
  
  constructor(private cursoService: CursosService,
    private route: ActivatedRoute,
    private router: Router){
      this.cursos = this.cursoService.cursos;
      this.curso = route.snapshot.params["id"];
    }
  ngOnInit(): void {
    this.route.params.subscribe(data => {
      this.curso._id = data['id'];
    })
  }
  modificarCurso(curso: Curso){
    this.cursoService.modificarCurso(curso._id, curso._nombre, curso._duracion, curso._nivel);
    this.router.navigate(['/']);
  }
  altaCurso(){
    console.log('AltaCurso');
    this.curso._id = (this.cursos[this.cursos.length - 1]._id);
    this.cursos.push(this.curso);
  }
  modificarAltaCurso(){
    if(this.curso._id == undefined){
      this.altaCurso();
    }else{
      this.modificarCurso(this.curso);
    }
    this.router.navigate(['/'])
  }
}
