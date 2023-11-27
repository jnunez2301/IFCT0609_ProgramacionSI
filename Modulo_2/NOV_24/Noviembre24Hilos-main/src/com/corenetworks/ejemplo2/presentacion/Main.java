/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corenetworks.ejemplo2.presentacion;

import com.corenetworks.com.corenetworks.ejemplo2.modelo.Ratones;

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
        Ratones r1 = new Ratones("Raton1", 10);
        Ratones r2 = new Ratones("Raton2",10);
        r1.start();
        r2.start();
    }
}
