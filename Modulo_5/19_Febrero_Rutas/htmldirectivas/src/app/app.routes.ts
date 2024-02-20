import { Routes } from '@angular/router';
import { ArmaPCComponent } from './arma-pc/arma-pc.component';
import { ReservaVuelosComponent } from './reserva-vuelos/reserva-vuelos.component';
import { EmpleadoDinamicoComponent } from './empleado-dinamico/empleado-dinamico.component';

export const routes: Routes = 
[
    {path:"arma", component:ArmaPCComponent},
    {path:"reserva", component:ReservaVuelosComponent},
    {path:"empleado", component:EmpleadoDinamicoComponent},
    
];
