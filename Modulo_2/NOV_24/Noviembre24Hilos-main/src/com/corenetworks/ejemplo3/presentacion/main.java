package com.corenetworks.ejemplo3.presentacion;

import com.corenetworks.ejemplo3.modelo.Impresora;
import com.corenetworks.ejemplo3.modelo.TareaImpresion;

public class main {
    public static void main(String[] args) {

            Impresora impresora = new Impresora();

            // Crear dos hilos que imprimen documentos en paralelo
            Thread hilo1 = new Thread(new TareaImpresion(impresora, "Documento1"));
            Thread hilo2 = new Thread(new TareaImpresion(impresora, "Documento2"));

            hilo1.start();
            hilo2.start();
        }
    }

