package com.corenetworks.ejemplo3.modelo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Impresora {
    private Lock lock = new ReentrantLock();

    public void imprimirDocumento(String documento) {
        lock.lock();
        try {
            System.out.println("Imprimiendo documento: " + documento + " en la impresora: " + Thread.currentThread().getName());
            Thread.sleep(1000); // Simula el tiempo que lleva imprimir el documento
            System.out.println("Documento impreso: " + documento + " por la impresora: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
