import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-empleado-dinamico',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './empleado-dinamico.component.html',
  styleUrl: './empleado-dinamico.component.css'
})
export class EmpleadoDinamicoComponent {
  genero:string="";
  generos:string[]=["Mujer","Hombre","Otros"];
  nacionalidad:string="";
  nacionalidades:string[]=["Española","Norteamericana","Rusa","Mexicana"];
  lenguajesProgramacion:string[]=["C++","Java","JS","Python"];
  cMas:boolean=false;
  java:boolean=false;
  js:boolean=false;
  python:boolean=false;

  mostrarInfo():void {
    let mensaje:string=`Genero : ${this.genero}
    Nacionalidad :${this.nacionalidad}
    Lenguajes de Programación: ${this.lenguajesProgramacion}`;
    alert(mensaje);
  }

}
