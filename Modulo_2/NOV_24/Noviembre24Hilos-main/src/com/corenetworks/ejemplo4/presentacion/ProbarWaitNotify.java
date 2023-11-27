package com.corenetworks.ejemplo4.presentacion;


import com.corenetworks.ejemplo4.modelo.Compartido;
import com.corenetworks.ejemplo4.modelo.TareaEspera;

public class ProbarWaitNotify {
    public static void main(String[] args) {
        Compartido compartido = new Compartido();

        // Crear tres hilos que esperan
        Thread hilo1 = new Thread(new TareaEspera(compartido), "Hilo1");
        Thread hilo2 = new Thread(new TareaEspera(compartido), "Hilo2");
        Thread hilo3 = new Thread(new TareaEspera(compartido), "Hilo3");

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        // Esperar un momento para que los hilos entren en espera
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notificar a los hilos que estaban esperando
        compartido.notificar();

    }
}
