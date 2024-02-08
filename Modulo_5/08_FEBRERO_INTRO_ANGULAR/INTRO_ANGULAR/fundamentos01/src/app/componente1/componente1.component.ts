import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-componente1',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './componente1.component.html',
  styleUrl: './componente1.component.css'
})
export class Componente1Component {
  nombre = 'Jonathan';
  dni:String = '12345678D';
}
