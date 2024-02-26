import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaEmpleadosComponent } from './lista-empleados/lista-empleados.component';
import { AltaEmpleadoComponent } from './alta-empleado/alta-empleado.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ListaEmpleadosComponent, AltaEmpleadoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'comunicacion-back';
}
