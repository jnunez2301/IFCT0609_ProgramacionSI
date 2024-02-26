import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FAlumnosComponent } from './f-alumnos/f-alumnos.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FAlumnosComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  
}
