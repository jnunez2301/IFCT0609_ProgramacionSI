import { Component } from '@angular/core';
import { Hijo2Component } from '../hijo2/hijo2.component';

@Component({
  selector: 'app-padre2',
  standalone: true,
  imports: [Hijo2Component],
  templateUrl: './padre2.component.html',
  styleUrl: './padre2.component.css'
})
export class Padre2Component {

  inscripcion: string[]=[];

  agregarAsignatura(elemento:string){
    
    this.inscripcion.push(elemento);
  }

}
