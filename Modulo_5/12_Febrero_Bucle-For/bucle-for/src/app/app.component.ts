import { Component } from '@angular/core';
import { BuclesComponent } from './bucles/bucles.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [BuclesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
}
