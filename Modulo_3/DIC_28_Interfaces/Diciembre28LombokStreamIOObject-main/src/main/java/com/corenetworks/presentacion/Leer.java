package com.corenetworks.presentacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer {
    public static void main(String[] args) {
        FileInputStream fEntrada;
        ObjectInputStream objeto;
        try {
            fEntrada = new FileInputStream("tienda.dat");
            objeto = new ObjectInputStream(fEntrada);
            System.out.println(objeto.readObject());
            System.out.println(objeto.readObject());
            System.out.println(objeto.readObject());
            System.out.println(objeto.readObject());
            System.out.println(objeto.readObject());
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
