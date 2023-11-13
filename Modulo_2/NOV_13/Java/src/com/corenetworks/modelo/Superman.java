package com.corenetworks.modelo;

public class Superman implements IObjetoVolador{

    public String pararBalas(){
        return "Superman parando balas";
    }
    public String saltarEdificio(){
        return "Superman saltando edificio";
    }


    @Override
    public String despegar() {
        return "Superman despegando";
    }

    @Override
    public String volar() {
        return "Superman volando";
    }

    @Override
    public String aterrizar() {
        return "Superman aterrizando";
    }
}
