import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Empleado } from '../_modelo/empleado';

@Injectable({
  providedIn: 'root',
})
export class EmpleadoService {

  private url: string = 'http://localhost:4000/empleados';

  listar(): Observable<Empleado[]> {
    return this.http.get<Empleado[]>(this.url);
  }

  alta(e1: Empleado): Observable<Empleado>{
    return this.http.post<Empleado>(this.url, e1);
  }

  constructor(private http: HttpClient) {}
}