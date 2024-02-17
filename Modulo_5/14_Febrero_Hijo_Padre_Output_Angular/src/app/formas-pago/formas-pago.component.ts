import { Component } from '@angular/core';

@Component({
  selector: 'app-formas-pago',
  standalone: true,
  imports: [],
  templateUrl: './formas-pago.component.html',
  styleUrl: './formas-pago.component.css'
})
export class FormasPagoComponent {
  formasPagos:string[] = ["Efectivo", "Tarjeta de Crédito","Bizum","Bitcoins","Contra rembolso"];

}
