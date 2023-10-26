package com.corenetworks.modelo;

public class Proveedor {
    //Atributos
    private int idProveedor;
    private String nombre;
    private int telefono;
    private int cantidadEmpleados;

    //Setters
    public void setIdProveedor(int idProveedor){
        this.idProveedor = idProveedor;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setCantidadEmpleados(int cantidadEmpleados){
        this.cantidadEmpleados = cantidadEmpleados;
    }

    //Getters
    public int getIdProveedor(){
        return idProveedor;
    }
    public int getCantidadEmpleados(){
        return cantidadEmpleados;
    }
    public int getTelefono(){
        return telefono;
    }
    public String getNombre(){
        return nombre;
    }
}
