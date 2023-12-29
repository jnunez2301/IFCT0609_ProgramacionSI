package com.corenetworks.presentacion;

import com.corenetworks.modelo.Camisa;
import com.corenetworks.modelo.Pantalon;
import com.corenetworks.modelo.Zapatos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fSalida;
        ObjectOutputStream objeto;
        Pantalon p1 = new Pantalon(30.5,"Zara",1,"casual");
        Pantalon p2 = new Pantalon(31.5,"HM",1,"vaquero");
        Camisa c1 = new Camisa(20.43,"Zara",1,false,35);
        Zapatos z1 = new Zapatos(50.5, "Clarks",2,2);
        Zapatos z2 = new Zapatos(50.5, "Adidas",2,2);

        try {
            //2. Acciones de E/S

            fSalida = new FileOutputStream("tienda.dat");
            objeto = new ObjectOutputStream(fSalida);
            objeto.writeObject(p1);
            objeto.writeObject(p2);
            objeto.writeObject(c1);
            objeto.writeObject(z1);
            objeto.writeObject(z2);
            // 3, Cerrar flujos
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
