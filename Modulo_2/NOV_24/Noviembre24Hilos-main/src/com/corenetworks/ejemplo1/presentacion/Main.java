/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corenetworks.ejemplo1.presentacion;

import com.corenetworks.ejemplo1.modelo.Contador;

/**
 *
 * @author Gabriela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contador hilo1 = new Contador(0);
        Contador hilo2 = new Contador(200);
        hilo1.setPriority(5);
        hilo2.setPriority(1);
        System.out.println("Hilo1.....");
        hilo1.start();
        
        System.out.println("Hilo2.....");
        hilo2.start();
       
        
    }
}
