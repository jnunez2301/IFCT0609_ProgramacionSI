import { Component, OnInit } from '@angular/core';
import { Curso } from '../_modelo/curso';
import { ActivatedRoute, Router, RouterModule } from '@angular/router';
import { CursosService } from '../_servicio/cursos.service';

@Component({
  selector: 'app-curso-lista',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './curso-lista.component.html',
  styleUrl: './curso-lista.component.css',
})
export class CursoListaComponent implements OnInit {
  ngOnInit(): void {
    let idParam = this.route.snapshot.paramMap.get('id');
    let id = idParam ? +idParam : 0;
    this.devolverCursos();
  }
  devolverCursos(){
    return this.cursos = this.cursoService.cursos;
  }
  modificarCurso(id: number){
    let curso = this.cursos.find(c => c._id === id);
    if(curso){
      this.router.navigate(['/curso', id])
    }else{
      alert('No se ha encontrado el curso con ID ' + id)
    }
  }
  cursos: Curso[] = [];
  constructor(
    public cursoService: CursosService,
    private route: ActivatedRoute,
    private router: Router
  ) {}
}
