import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TiendaOnlineComponent } from './tienda-online/tienda-online.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, TiendaOnlineComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'repaso_html';
}
