import { Component } from '@angular/core';
import { PadreComponent } from './padre/padre.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PadreComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'padre-hijo';
}
