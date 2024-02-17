import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PadreComponent } from './padre/padre.component';
import { Padre2Component } from './padre2/padre2.component';
import { ArrayEjemploComponent } from './array-ejemplo/array-ejemplo.component';
import { FormasPagoComponent } from './formas-pago/formas-pago.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, PadreComponent,Padre2Component,
    ArrayEjemploComponent, FormasPagoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'fundamentos05hijopadre';
}
