import { Routes } from '@angular/router';
import { InmueblesComponent } from './inmuebles/inmuebles.component';
import { DetalleInmuebleComponent } from './detalle-inmueble/detalle-inmueble.component';

export const routes: Routes = [
    {path: 'inmuebles', component: InmueblesComponent},
    {path: 'detalle/:id', component: DetalleInmuebleComponent},
    {path: '', redirectTo: '/inmuebles', pathMatch: 'full'},
    {path: "**", component: InmueblesComponent}
    
];
