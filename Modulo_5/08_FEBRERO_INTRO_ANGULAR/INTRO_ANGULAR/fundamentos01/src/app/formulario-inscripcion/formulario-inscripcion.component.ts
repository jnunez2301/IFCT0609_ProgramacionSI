import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-formulario-inscripcion',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './formulario-inscripcion.component.html',
  styleUrl: './formulario-inscripcion.component.css'
})
export class FormularioInscripcionComponent {
  nombre:String= '';
  dni:String='';
  edad:Number=0;
  cursoSolicitado:String='';
  nivelEstudio:String='';
}
