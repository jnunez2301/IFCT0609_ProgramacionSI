import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-empleado-dinamico',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './empleado-dinamico.component.html',
  styleUrl: './empleado-dinamico.component.css',
})
export class EmpleadoDinamicoComponent {
  genero: string = '';
  generos: string[] = ['Mujer', 'Hombre', 'Otros'];
  nacionalidad: string = '';
  nacionalidades: string[] = [
    'Española',
    'Hondureña',
    'Rusa',
    'Alemana',
    'Mexicana',
  ];
  mostrarInfo(): void {
    let mensaje: string = '';
    mensaje = `Genero: ${this.genero} | Nacionalidad: ${this.nacionalidad}`;

    alert(mensaje);
  }
}
