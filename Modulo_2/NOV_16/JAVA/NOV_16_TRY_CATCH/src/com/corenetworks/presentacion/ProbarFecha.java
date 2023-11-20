package com.corenetworks.presentacion;

import com.corenetworks.modelo.Fecha;

public class ProbarFecha {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        try {
            f1.setMes(13);
        } catch (Exception e0) {
            System.out.println(e0.toString());
        }
        try {
            f1.setDia(31);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
