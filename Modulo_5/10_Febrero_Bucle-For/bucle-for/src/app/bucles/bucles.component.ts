import { Component } from '@angular/core';

@Component({
  selector: 'app-bucles',
  standalone: true,
  imports: [],
  templateUrl: './bucles.component.html',
  styleUrl: './bucles.component.css'
})
export class BuclesComponent {
  usuarios = [
    {
      id: 1, nombre: 'Pedrito'
    },
    {
      id: 2, nombre: 'Pablito'
    },
    {
      id: 3, nombre: 'Maria'
    }
  ]
  logeado= false;
  logear(): void{
    this.logeado = true;
  }
  salir(): void{
    this.logeado = false;
  }
}
