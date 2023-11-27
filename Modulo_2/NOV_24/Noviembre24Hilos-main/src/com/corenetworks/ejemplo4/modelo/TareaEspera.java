package com.corenetworks.ejemplo4.modelo;

public class TareaEspera implements Runnable{

    private Compartido compartido;

    public TareaEspera(Compartido compartido) {
        this.compartido = compartido;
    }

    @Override
    public void run() {
        compartido.esperar();
    }
}
