package com.corenetworks.examen.Presentacion;

import com.corenetworks.examen.Modelo.Paquete;
import com.corenetworks.examen.Modelo.Servidor;

import java.util.Arrays;
import java.util.Scanner;

public class ProbarMensaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Paquete p1 = new Paquete();

        Servidor server1 = new Servidor();


        //Obtener el mensaje
        String msj;

        System.out.println("Ingrese ipOrigen");
        p1.setIpOrigen(sc.nextLine());
        System.out.println("Ingrese ipDestino");
        p1.setIpDestino(sc.nextLine());
        System.out.println("Ingrese mensaje");
        msj = sc.nextLine();
        p1.setMensaje(msj);


        //Array par almacenar el mensaje

        String[] msjArr;
        int largoArray;
        Paquete[] paquetes = new Paquete[0];

        if (msj.length() > 20) {
            largoArray = (msj.length() / 20) + ((msj.length() % 20 > 0) ? 1 : 0);
            //Delete msjArray later !!!!!!!!!!!!!!
            msjArr = new String[largoArray];
            paquetes = new Paquete[largoArray];


            for (int i = 0; i < largoArray; i++) {
                int inicio = i * 20;
                int fin = inicio + 20;
                if (fin > msj.length()) {
                    fin = msj.length();
                }
                msjArr[i] = msj.substring(inicio, fin);
                paquetes[i] = new Paquete(p1.getIpOrigen(), p1.getIpDestino(), msjArr[i], p1.getContadorPaquetes());
            }
        } else {
            msjArr = new String[]{msj};
            p1.setMensaje(Arrays.toString(msjArr));
        }
        p1.setMensaje(Arrays.toString(msjArr));
        p1.setContadorPaquetes(msjArr.length);


        // MOSTRAR EN CONSOLA PAQUETE 1
        System.out.println(p1.toString());

        // SERVIDOR
        System.out.println(server1.leerPaquetes(paquetes));
        System.out.println(server1.verificarPaquetes(paquetes, p1.getContadorPaquetes()));



        sc.close();
    }
}
