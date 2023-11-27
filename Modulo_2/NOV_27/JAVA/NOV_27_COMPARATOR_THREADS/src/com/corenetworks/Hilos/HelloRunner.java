package com.corenetworks.Hilos;

public class HelloRunner implements Runnable{
    public void run() {
        int i = 0;
        while(true){
            System.out.println("Hola " + i++);
            if( i == 50){
                break;
            }
        }
    }
}
