import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-arma-pc',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './arma-pc.component.html',
  styleUrl: './arma-pc.component.css'
})
export class ArmaPCComponent {
  tRAM:string = '';
  tamanosRAM:string[]=["RAM32", "RAM16", "RAM8"];
  procesador:string='';
  procesadores:string[]=["Corei9N8", "Corei9N8Gen", "Corei7N8", "AMD"];
  tarjetaGrafica:boolean=false;
  discoDuro:string='HDD';
  discosDuros:string[]=["HDD","SSD"];
  fuenteAlimentacion:string='600';
  fuentesAlimentacion:string[]=["600","700","800","900","1000","1200"];

  mostrarInfo():void {
    let mensajes:string = `
    Su configuración es la siguiente
    tamaño de la RAM: ${this.tRAM}
    Procesador: ${this.procesador}
    Tarjeta Grafica: ${this.tarjetaGrafica}
    Discos Duro : ${this.discoDuro}
    Fuente de Alimentacion : ${this.fuenteAlimentacion}
    `
    alert(mensajes);
  }

}
