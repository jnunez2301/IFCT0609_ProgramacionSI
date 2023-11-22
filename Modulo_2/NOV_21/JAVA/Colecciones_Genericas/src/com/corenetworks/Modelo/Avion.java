package com.corenetworks.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Avion {
    private List<Silla> claseEjecutiva = new ArrayList<>();
    private List<Silla> claseTurista = new ArrayList<>();

    @Override
    public String toString() {
        return "Avion{" +
                "claseEjecutiva=" + claseEjecutiva +
                ", claseTurista=" + claseTurista +
                ", numAsiento=" + numAsiento +
                '}';
    }

    int numAsiento;

    public Avion() {}
    public int asignarAsientoEjecutivo(Pasajero p, Ubicacion u){
        //Recorrer la lista claseEjecutiva
        //Dentro del bucle verificar uno libre con la misma ubicación
        for(Silla elemento: claseEjecutiva){
            if(elemento.getPasajero() == null && elemento.getUbicacion() == u) {
                elemento.setPasajero(p);
                elemento.setUbicacion(u);
                numAsiento++;
                return elemento.getNumero();
            }
        }
        return 0;
    }
    public int asignarAsientoTurista(Pasajero p, Ubicacion u){
        //Recorrer la lista claseEjecutiva
        //Dentro del bucle verificar uno libre con la misma ubicación
        for(Silla elemento: claseTurista){
            if(elemento.getPasajero() == null && elemento.getUbicacion() == u) {
                elemento.setPasajero(p);
                elemento.setUbicacion(u);
                numAsiento++;
                return elemento.getNumero();
            }
        }
        return 0;
    }
    public Avion(List<Silla> claseEjecutiva, List<Silla> claseTurista) {
        this.claseEjecutiva = claseEjecutiva;
        this.claseTurista = claseTurista;
    }

    public List<Silla> getClaseEjecutiva() {
        return claseEjecutiva;
    }

    public List<Silla> getClaseTurista() {
        return claseTurista;
    }
}
