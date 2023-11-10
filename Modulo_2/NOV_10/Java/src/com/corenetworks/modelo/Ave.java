package com.corenetworks.modelo;

public class Ave implements IObjetoVolador{
    @Override
    public String despegar() {
        return "Ave despegando";
    }

    @Override
    public String volar() {
        return "Ave volando";
    }

    @Override
    public String aterrizar() {
        return "Ave aterrizando...";
    }
    public String hacerNido(){
        return "El ave esta haciendo un nido";
    }
    public String ponerHUevo(){
        return "El ave esta poniendo un huevo";
    }
}
