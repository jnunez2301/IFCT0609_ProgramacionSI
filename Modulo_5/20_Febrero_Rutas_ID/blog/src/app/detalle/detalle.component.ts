import { Component, Input, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-detalle',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './detalle.component.html',
  styleUrl: './detalle.component.css'
})
export class DetalleComponent implements OnInit{
  @Input() id:number = 0;
  ngOnInit(): void {
    console.log("id ->" + this.id);
  }
  posts=[{
    "id": 1,
    "thumbnailUrl": "https://robohash.org/estlaboriosamerror.png?size=250x250&set=set1",
    "title": "Kawa",
    "description": "Automated fault-tolerant toolset"
  }, {
    "id": 2,
    "thumbnailUrl": "https://robohash.org/excepturietlaboriosam.png?size=250x250&set=set1",
    "title": "Charlie Chan's Secret",
    "description": "Profit-focused encompassing throughput"
  }, {
    "id": 3,
    "thumbnailUrl": "https://robohash.org/quaeanimirepellendus.png?size=250x250&set=set1",
    "title": "Love Can Seriously Damage Your Health",
    "description": "Organized directional software"
  }, {
    "id": 4,
    "thumbnailUrl": "https://robohash.org/cumquenonsimilique.png?size=250x250&set=set1",
    "title": "Long Gray Line, The",
    "description": "Programmable non-volatile core"
  }, {
    "id": 5,
    "thumbnailUrl": "https://robohash.org/doloremqueeosmolestias.png?size=250x250&set=set1",
    "title": "Camille Claudel",
    "description": "Phased client-driven orchestration"
  }, {
    "id": 6,
    "thumbnailUrl": "https://robohash.org/consequaturquibusdaminventore.png?size=250x250&set=set1",
    "title": "American Pimp",
    "description": "Extended didactic concept"
  }, {
    "id": 7,
    "thumbnailUrl": "https://robohash.org/veniamametnon.png?size=250x250&set=set1",
    "title": "Exodus",
    "description": "Multi-layered stable frame"
  }, {
    "id": 8,
    "thumbnailUrl": "https://robohash.org/eumlaudantiumnecessitatibus.png?size=250x250&set=set1",
    "title": "Meat the Truth",
    "description": "Fundamental mission-critical budgetary management"
  }, {
    "id": 9,
    "thumbnailUrl": "https://robohash.org/cumbeataererum.png?size=250x250&set=set1",
    "title": "Suicide Killers",
    "description": "Realigned transitional knowledge user"
  }, {
    "id": 10,
    "thumbnailUrl": "https://robohash.org/delectuspraesentiumquae.png?size=250x250&set=set1",
    "title": "Story of Maths, The",
    "description": "Re-engineered eco-centric data-warehouse"
  }]
}
