package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio8Clase {

    public static void main(String[] args) {
        FileOutputStream fSalida;
        DataOutputStream dato;
        try {
            //1. Instanciar un FileOutputStream
            fSalida = new FileOutputStream("primitivos.dat", false);
            dato = new DataOutputStream(fSalida);
            byte vByte =5;
            int vInt = 10;
            short vShort = 15;
            long vLong = 20L;
            float vFloat = 25f;
            double vDouble = 30;
            boolean vBoolean = false;
            char vchar = 'a';
            //2. DataOutPutStream

            //3. Escribie en flujo de datos cada uno de los datos primitivos

            dato.writeByte(vchar);

            dato.writeInt(vInt);

            dato.writeShort(vShort);

            dato.writeLong(vLong);

            dato.writeFloat(vFloat);

            dato.writeDouble(vDouble);

            dato.writeChar(vchar);

            dato.writeBoolean(vBoolean);
            //4. Cerrar el flujo de datos
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
