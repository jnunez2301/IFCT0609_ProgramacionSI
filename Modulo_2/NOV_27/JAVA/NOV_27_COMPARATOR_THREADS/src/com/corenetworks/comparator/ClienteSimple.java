package com.corenetworks.comparator;

public class ClienteSimple {
    String nombre;
    double cifraVentas;
    String nif;
    public ClienteSimple(){}

    @Override
    public String toString() {
        return "ClienteSimple{" +
                "nombre='" + nombre + '\'' +
                ", cifraVentas=" + cifraVentas +
                ", nif='" + nif + '\'' +
                '}';
    }

    public ClienteSimple(String nombre, double cifraVentas, String nif) {
        this.nombre = nombre;
        this.cifraVentas = cifraVentas;
        this.nif = nif;
    }
}
