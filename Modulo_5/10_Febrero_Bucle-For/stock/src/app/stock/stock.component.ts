import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-stock',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './stock.component.html',
  styleUrl: './stock.component.css',
})
export class StockComponent {
  description: string = '';
  code: number = 0;
  precio_costo: number = 0;
  precio_venta: number = 0;
  stock_ideal: number = 0;
  correcto: boolean = false;
  resultado: object = {};
  abierto: boolean = false;
  ingresar(): void {
    if (
      this.precio_costo < 3 ||
      this.precio_venta < 3 ||
      this.stock_ideal < 3 ||
      this.code === 0 ||
      this.description.length < 5
    ) {
      this.correcto = false;
      alert('Rellene correctamente los campos');
    } else {
      this.resultado = {
        description: this.description,
        code: this.code,
        precio_costo: this.precio_costo,
        precio_venta: this.precio_venta,
        stock_ideal: this.stock_ideal,
      };
      this.description = '';
      this.code = 0;
      this.precio_costo = 0;
      this.precio_venta = 0;
      this.stock_ideal = 0;
      this.correcto = true;
      this.abierto = true;
    }
  }
  cerrar():void{
    this.abierto = false;    
  }
}
