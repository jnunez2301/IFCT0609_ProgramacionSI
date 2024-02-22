import { Routes } from '@angular/router';
import { CursoListaComponent } from './curso-lista/curso-lista.component';
import { CursoAltaComponent } from './curso-alta/curso-alta.component';

export const routes: Routes = [
    {path: 'curso-alta', component: CursoAltaComponent},
    {path: 'curso-lista', component: CursoListaComponent},
    {path: '', redirectTo: '/curso-lista', pathMatch: 'full'},
    {path: '**', component: CursoListaComponent }
];
