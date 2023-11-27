package com.corenetworks.presentacion;

import com.corenetworks.Hilos.HelloRunner;
import com.corenetworks.Hilos.MiHilo;

public class UsoHilos {
    public static void main(String[] args) {
        Thread miHilo = new MiHilo();
        miHilo.start();
        // Se pone en cola
        HelloRunner r = new HelloRunner();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}
