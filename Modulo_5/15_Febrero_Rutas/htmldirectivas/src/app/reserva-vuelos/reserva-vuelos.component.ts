import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-reserva-vuelos',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './reserva-vuelos.component.html',
  styleUrl: './reserva-vuelos.component.css'
})
export class ReservaVuelosComponent {
  origen:string = '';
  destino:string = '';
  fIda:any='';
  fVuelta:any='';
  nPasajeros:number = 0; 
  ciudades:string[] = ["Madrid", "Barcelona", "Bilbao", "Santander", "Vigo"];
  

  mostrarInfo():void {
    let mensaje =`
    Origen: ${this.origen}
    Destino: ${this.destino}
    Fecha de Ida : ${this.fIda}
    Fecha de Vuelta :${this.fVuelta}
    Número de pasajeros : ${this.nPasajeros}
    `;
    alert(mensaje);
  }
}
