import { Routes } from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { DondeEstamosComponent } from './donde-estamos/donde-estamos.component';
import { QuienesSomosComponent } from './quienes-somos/quienes-somos.component';
import { ContactarComponent } from './contactar/contactar.component';
import { AppComponent } from './app.component';

export const routes: Routes = [
    {path: 'inicio', component: InicioComponent},
    {path: 'donde-estamos', component: DondeEstamosComponent},
    {path: 'quienes-somos', component: QuienesSomosComponent},
    {path: 'contactar', component: ContactarComponent}
];
