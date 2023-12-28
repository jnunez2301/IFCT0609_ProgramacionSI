package com.corenetworks.presentacion;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProbarDataReaderStream {
    public static void main(String[] args) {
        //1. Definición de variables
        FileInputStream fEntrada;
        DataInputStream dato;

        try {
            fEntrada = new FileInputStream("primitivos.dat");
            dato = new DataInputStream(fEntrada);
            System.out.println("byte ->"+ dato.readByte());
            System.out.println("entero ->"+ dato.readInt());
            System.out.println("short ->"+ dato.readShort());
            System.out.println("long ->"+ dato.readLong());
            System.out.println("float ->"+ dato.readFloat());
            System.out.println("Double ->"+ dato.readDouble());
            System.out.println("Char ->"+ dato.readChar());
            System.out.println("Boolean ->"+ dato.readBoolean());
            //2. Acciones de entrada / salida
            //3. Cerrar los flujos
            dato.close();
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
