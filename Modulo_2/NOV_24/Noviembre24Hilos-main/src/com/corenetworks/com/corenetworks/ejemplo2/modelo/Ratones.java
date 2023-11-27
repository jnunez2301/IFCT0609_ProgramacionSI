/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.corenetworks.com.corenetworks.ejemplo2.modelo;
public class Ratones extends Thread {
    String nombre;
    int comida;

    public Ratones(String nombre, int comida) {
        this.nombre = nombre;
        this.comida = comida;
    }
    
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (comida>0) {
                comer();
            }else{
                llenar();
            }
        }
    }
    public void comer(){
        synchronized(this){
            if(comida>0){
            comida -=1 ;
                System.out.println(this.nombre + "Ha comido");
        }
        }
    }
    public synchronized void llenar(){
        comida +=10;
        System.out.println(this.nombre + "Se le ha llenado el plato");
    }

    
            

}
