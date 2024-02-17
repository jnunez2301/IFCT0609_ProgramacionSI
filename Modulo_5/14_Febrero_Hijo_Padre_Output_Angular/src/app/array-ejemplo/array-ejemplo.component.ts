import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-array-ejemplo',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './array-ejemplo.component.html',
  styleUrl: './array-ejemplo.component.css'
})
export class ArrayEjemploComponent {
  nombres:string[] = ["Juna","Mariana","Nikita","Fabiola","Eloisa"];
  edades:number[] = [21,35,16,20,14,16];
  edadesfiltradas:number[] = [];
  edadesDobles:number[] = [];

  nombre:string="";
  agregar():void{
    this.nombres.push(this.nombre);
  }

  eliminar():void{
    this.nombres.pop();
  }

  recorrerArray():void{
    this.nombres.forEach(
      elemento=>console.log(elemento));
  }

  filtrarArray():void{
    this.edadesfiltradas=this.edades.filter(e=>e>18);
    this.edadesfiltradas.forEach(elemento=>console.log(elemento))
  }

  calcularDoble():void{
      this.edadesDobles = this.edades.map(elemento=>elemento*2);
      this.edadesDobles.forEach(elemento=>console.log(elemento));
  }
}
