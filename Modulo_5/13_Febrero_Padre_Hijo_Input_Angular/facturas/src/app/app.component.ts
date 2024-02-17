import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FacturaPadreComponent } from './factura-padre/factura-padre.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FacturaPadreComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
}
