/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.ejemplo1.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Contador extends Thread {
    private int incremento;

    public Contador(int incremento) {
        this.incremento = incremento;
    }
    
    @Override
    public void run() {
        int j= incremento;
        for (int i = incremento; incremento < j + 14; incremento++) {
            System.out.println(incremento + "-"+ getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println("Error al dormir el hilo");
            }
        }
    }

}
