import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-contactar',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './contactar.component.html',
  styleUrl: './contactar.component.css',
})
export class ContactarComponent {
  correo: string = '';
  nombre: string = '';
  telefono: string = '';
  comentario: string = '';
  enviado: boolean = false;
  enviarInfo() {
    // alert(`${this.correo + this.nombre + this.telefono + this.comentario}`);
    this.enviado = true;
  }
}
