package com.corenetworks.ejemplo4.modelo;
public class Compartido {
    private boolean condicion = false;

    public synchronized void esperar() {
        while (!condicion) {
            try {
                System.out.println(Thread.currentThread().getName() + " está esperando.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " ha terminado de esperar.");
    }

    public synchronized void notificar() {
        condicion = true;
        System.out.println("Notificando a todos los hilos que estaban esperando.");
        notifyAll();
    }
}





