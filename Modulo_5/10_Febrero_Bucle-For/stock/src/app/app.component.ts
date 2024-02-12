import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StockComponent } from './stock/stock.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [StockComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'stock';
}
