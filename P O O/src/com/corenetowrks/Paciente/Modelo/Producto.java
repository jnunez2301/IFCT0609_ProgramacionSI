package com.corenetowrks.Paciente.Modelo;

public class Producto {
    private int idProducto;
    private String nombre;
    private int cantidadExistencia;

    public Producto() {}

    public Producto(int idProducto, String nombre, int cantidadExistencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencia = cantidadExistencia;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVentaProducto(int cantidad){
        if(cantidadExistencia > 0 && cantidad > 0){
            this.cantidadExistencia = cantidadExistencia - cantidad;
        }
    }

    public void setCompraProducto(int cantidad){
        if(cantidad > 0){
            this.cantidadExistencia = cantidadExistencia + cantidad;
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    @Override
    public String toString(){
        return "Paciente: \n"
                + idProducto + " id producto\n"
                + nombre + " nombre producto\n"
                + cantidadExistencia + " cantidad de existencias\n";
    }
}
