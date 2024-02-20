import { Routes } from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { DetalleComponent } from './detalle/detalle.component';

export const routes: Routes = [
    {path: '', redirectTo:'inicio', pathMatch: 'full'},
    {path: 'inicio', component: InicioComponent},
    {path: 'detalle', component: DetalleComponent},
    {path: 'detalle/:id', component: DetalleComponent}
];
