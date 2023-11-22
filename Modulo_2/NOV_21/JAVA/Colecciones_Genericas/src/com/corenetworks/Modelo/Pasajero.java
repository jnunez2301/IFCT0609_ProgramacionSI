package com.corenetworks.Modelo;

import java.util.Objects;

public class Pasajero {
    private String cedula;
    private String nombre;

    @Override
    public String toString() {
        return "Pasajero{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(cedula, pasajero.cedula) && Objects.equals(nombre, pasajero.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre);
    }

    public Pasajero() {
    }

    public Pasajero(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
