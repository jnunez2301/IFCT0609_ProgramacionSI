package com.corenetworks.modelo;

import java.util.Objects;

public class Persona {
    private String nombre;
    private int edad;
    private double nota;

    public Persona() {
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Persona(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
