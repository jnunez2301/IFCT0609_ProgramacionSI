import { Component, Input, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-detalle',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css',
})
export class DetalleComponent implements OnInit {
  @Input() id!: string;
  // La exclamación indicia que el dato es opcional
  ngOnInit(): void {
    console.log('id ->' + this.id);
  }
  labels: string[] = ['id', 'nombre', 'imagen'];
  productos = [
    {
      productoId: '1',
      nombre: 'Potatoes - Yukon Gold 5 Oz',
      img: 'https://robohash.org/mollitiaeaquedignissimos.png?size=50x50&set=set1',
    },
    {
      productoId: '2',
      nombre: 'Puree - Mango',
      img: 'https://robohash.org/optioquiofficiis.png?size=50x50&set=set1',
    },
    {
      productoId: '3',
      nombre: 'Chocolate - Milk Coating',
      img: 'https://robohash.org/etrecusandaeiure.png?size=50x50&set=set1',
    },
    {
      productoId: '4',
      nombre: 'Rolled Oats',
      img: 'https://robohash.org/suscipitetquia.png?size=50x50&set=set1',
    },
    {
      productoId: '5',
      nombre: 'Wine - Rosso Del Veronese Igt',
      img: 'https://robohash.org/utpariaturqui.png?size=50x50&set=set1',
    },
    {
      productoId: '6',
      nombre: 'Stock - Beef, White',
      img: 'https://robohash.org/laboreassumendaaliquam.png?size=50x50&set=set1',
    },
    {
      productoId: '7',
      nombre: 'Fruit Mix - Light',
      img: 'https://robohash.org/voluptatumofficiisrecusandae.png?size=50x50&set=set1',
    },
    {
      productoId: '8',
      nombre: 'Cheese - Swiss Sliced',
      img: 'https://robohash.org/ipsuminlaudantium.png?size=50x50&set=set1',
    },
    {
      productoId: '9',
      nombre: 'Mangostein',
      img: 'https://robohash.org/nisiveritatisquae.png?size=50x50&set=set1',
    },
    {
      productoId: '10',
      nombre: 'Sambuca Cream',
      img: 'https://robohash.org/dolorevoluptasenim.png?size=50x50&set=set1',
    },
  ];
}
