package com.corenetworks.modelo;

public class Persona {
    private String DNI;
    private String nombre;
    private String direccion;

    public Persona() {
    }

    public Persona(String DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
