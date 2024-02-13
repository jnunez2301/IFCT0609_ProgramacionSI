import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-calculadora',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css'
})
export class CalculadoraComponent {
  numero1:number = 0;
  numero2:number = 0;
  resultado:number  = 0;
  operacion:string = '';

  sumar(): void{
    this.operacion = '+'
  }
  resta(): void{
    this.operacion = '-'
  }
  multiplicar(): void{
    this.operacion = 'x';
  }
  dividir():void{
      this.operacion = '/';
  }

  onNumberClick(value: number): void {
    if (this.operacion === "") {
      if (this.numero1 === 0) {
        this.numero1 = value;
      } else {
        this.numero1 = Number(`${this.numero1}${value}`);
      }
    } else {
      if (this.numero2 === 0) {
        this.numero2 = value;
      } else {
        this.numero2 = Number(`${this.numero2}${value}`);
      }
    }
  }

  limpiarConsola():void{
    this.numero1 = 0;
    this.numero2 = 0;
    this.resultado = 0;
    this.operacion = '';
  }
  limpiarCalculo():void{
    this.numero1 = 0;
    this.numero2 = 0;
    this.operacion = '';
  }
  euroDolar():void{
    if(this.numero1 > 0){
      this.resultado = this.numero1 * 1.01;
    }else{
      alert('Por favor elija un valor');
    }
  }
  dolarEuro():void{
    if(this.numero1 > 0){
      this.resultado = this.numero1 * 0.93;
    }else{
      alert('Por favor elija un valor');
    }
  }
  calcular(): void{
    switch(this.operacion){
      case "+":
        this.resultado = this.numero1 + this.numero2;
        this.limpiarCalculo();
        break;
      case "-":
        this.resultado = this.numero1 - this.numero2;
        this.limpiarCalculo();
        break;
      case "/":
        if(this.numero2 === 0){
          alert('No se puede divir entre 0')
        }
        this.resultado = this.numero1 / this.numero2;
        this.limpiarCalculo();
        break;
      case "x":
        this.resultado = this.numero1 * this.numero2;
        this.limpiarCalculo();
        break;
      default:
        this.resultado = 0;
        this.limpiarConsola();
        break;
    }
  }
}
