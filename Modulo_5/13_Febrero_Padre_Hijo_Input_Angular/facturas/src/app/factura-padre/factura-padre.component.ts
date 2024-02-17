import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { FacturaHijoComponent } from '../factura-hijo/factura-hijo.component';

@Component({
  selector: 'app-factura-padre',
  standalone: true,
  imports: [FormsModule, FacturaHijoComponent],
  templateUrl: './factura-padre.component.html',
  styleUrl: './factura-padre.component.css'
})
export class FacturaPadreComponent {
  codigo_cliente:number = 0;
  forma_pago:string = '';
  direccion_entrega:string = '';
  producto:string = '';
}
