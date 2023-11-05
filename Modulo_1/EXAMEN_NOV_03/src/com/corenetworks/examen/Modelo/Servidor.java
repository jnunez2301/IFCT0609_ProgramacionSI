package com.corenetworks.examen.Modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Servidor {
    private String ip;

    public Servidor() {}

    public Servidor(String ip) {
        this.ip = ip;
    }
    public String leerPaquetes(Paquete[] paquetes){
        return "leerPaquetes ->"  + Arrays.toString(paquetes);
    }
    public boolean verificarPaquetes(Paquete[] paquetes, int contadorPaquetes){
        return paquetes.length == contadorPaquetes;
    }
}
