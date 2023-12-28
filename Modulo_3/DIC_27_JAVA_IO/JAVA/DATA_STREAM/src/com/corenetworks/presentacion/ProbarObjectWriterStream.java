package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProbarObjectWriterStream {

    public static void main(String[] args) {
        //1. Declarar variables
        FileOutputStream fSalida;
        ObjectOutputStream objeto;
        Producto p1;
        Producto p2;
        //2. Acciones e/s
        try {
            fSalida = new FileOutputStream("productos.dat");
            objeto = new ObjectOutputStream(fSalida);
            p1 = new Producto(1,"Te chai",1.3);
            objeto.writeObject(p1);
            p2 = new Producto(2,"Queso",11.3);
            objeto.writeObject(p2);
            //3. Cerrar
            objeto.flush();
            objeto.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
