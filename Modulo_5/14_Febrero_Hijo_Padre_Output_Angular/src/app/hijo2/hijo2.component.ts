import { Component, EventEmitter, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-hijo2',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './hijo2.component.html',
  styleUrl: './hijo2.component.css'
})
export class Hijo2Component {
  
  asignaturas:string[]=["programación en java",
  "SQL","JS","JSON","YAML"];
  asignaturaSeleccionada:string=this.asignaturas[0];
  @Output() eventoHaciaPadre= new EventEmitter();
  pasarPadre(){
    this.eventoHaciaPadre.emit(
      this.asignaturaSeleccionada);
  }



}
