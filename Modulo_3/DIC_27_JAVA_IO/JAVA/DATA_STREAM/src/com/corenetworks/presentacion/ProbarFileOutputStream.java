package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProbarFileOutputStream {
    public static void main(String[] args) {
        //1. Declarar Variables
        FileOutputStream fSalida= null;
        DataOutputStream buffer = null;
        int contador = 5;
        //2. Acciones de E/S
        try {
            fSalida = new FileOutputStream("Datos.dat");
            buffer = new DataOutputStream(fSalida);
            buffer.writeInt(contador);
            //2. Cerrar los flujos
            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
