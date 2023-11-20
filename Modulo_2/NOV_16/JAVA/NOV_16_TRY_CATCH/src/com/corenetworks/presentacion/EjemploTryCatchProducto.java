package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class EjemploTryCatchProducto {
    public static void main(String[] args) {
        try{
            TipoProducto leche = TipoProducto.valueOf("xx");
        }catch (Exception e1){
            System.out.println(e1.toString());
            /*throw new Error(e1.toString());*/
        }finally {
            System.out.println("Entro al finally");
        }
    }
}
