export class Curso{
    _id:number = 0;
    _nombre:string = '';
    _duracion:number = 0;
    _nivel:Nivel = Nivel.INICIACION;

    constructor(id:number, nombre: string, duracion:number, nivel:Nivel){
        this._id = id;
        this._nombre = nombre;
        this._duracion = duracion;
        this._nivel = nivel;
    }
}  

export enum Nivel{
    INICIACION = 'iniciacion',
    INTERMEDIO = 'intermedio',
    AVANZADO = 'avanzado'
}