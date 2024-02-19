import { Component } from '@angular/core';

@Component({
  selector: 'app-inicio',
  standalone: true,
  imports: [],
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.css',
})
export class InicioComponent {
  productos:any = [
    {
      img: 'https://robohash.org/suntmolestiaevel.png?size=50x50&set=set1',
      name: 'Östen',
      precio: '3€'
    },
    {
      img: 'https://robohash.org/remistemolestias.png?size=50x50&set=set1',
      name: 'Personnalisée',
      precio: '3€'
    },
    {
      img: 'https://robohash.org/temporeabassumenda.png?size=50x50&set=set1',
      name: 'Maëlyss',
      precio: '5€'

    },
    {
      img: 'https://robohash.org/dolorestemporaet.png?size=50x50&set=set1',
      name: 'Danièle',
      precio: '23€'
    },
    {
      img: 'https://robohash.org/ametetid.png?size=50x50&set=set1',
      name: 'Maëly',
      precio: '10€'
    },
    {
      img: 'https://robohash.org/quoetquis.png?size=50x50&set=set1',
      name: 'Léonore',
      precio: '15€'
    },
    {
      img: 'https://robohash.org/fugiatconsequaturvel.png?size=50x50&set=set1',
      name: 'Laïla',
      precio: '4€'
    },
    {
      img: 'https://robohash.org/verovoluptatumanimi.png?size=50x50&set=set1',
      name: 'Aloïs',
      precio: '10€'
    },
    {
      img: 'https://robohash.org/sintautsunt.png?size=50x50&set=set1',
      name: 'Ophélie',
      precio: '34€'
    },
    {
      img: 'https://robohash.org/temporibusdoloremdoloribus.png?size=50x50&set=set1',
      name: 'Marylène',
      precio: '54€'
    },
  ];
}
