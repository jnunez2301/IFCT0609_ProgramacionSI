import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Componente1Component } from './componente1/componente1.component';
import { FormularioInscripcionComponent } from './formulario-inscripcion/formulario-inscripcion.component';

@Component({
  selector: 'raiz',
  standalone: true,
  imports: [
    Componente1Component,
    FormularioInscripcionComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fundamentos01';
}
