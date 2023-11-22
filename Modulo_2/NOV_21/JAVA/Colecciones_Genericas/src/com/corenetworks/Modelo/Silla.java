package com.corenetworks.Modelo;

import java.util.Objects;

public class Silla {
    ClasePasaje clasePasaje;

    Ubicacion ubicacion;
    Pasajero pasajero;
    private int numero;

    public Silla() {
    }

    public Silla(ClasePasaje clasePasaje, Ubicacion ubicacion, Pasajero pasajero, int numero) {
        this.clasePasaje = clasePasaje;
        this.ubicacion = ubicacion;
        this.pasajero = pasajero;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "clasePasaje=" + clasePasaje +
                ", ubicacion=" + ubicacion +
                ", pasajero=" + pasajero +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Silla silla = (Silla) o;
        return numero == silla.numero && clasePasaje == silla.clasePasaje && ubicacion == silla.ubicacion && Objects.equals(pasajero, silla.pasajero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clasePasaje, ubicacion, pasajero, numero);
    }

    public ClasePasaje getClasePasaje() {
        return clasePasaje;
    }

    public void setClasePasaje(ClasePasaje clasePasaje) {
        this.clasePasaje = clasePasaje;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
