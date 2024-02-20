import { Routes } from '@angular/router';
import { InicioComponent } from './inicio/inicio.component';
import { DetalleComponent } from './detalle/detalle.component';

export const routes: Routes = [
    {path: 'detalle/:id', component: DetalleComponent},
    {path: '', redirectTo: 'inicio', pathMatch: 'full'},
    {path: '**', component: InicioComponent}
];
