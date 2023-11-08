package com.ejercicios.presentacion;

import com.ejercicios.modelo.Bateria;
import com.ejercicios.modelo.Flauta;
import com.ejercicios.modelo.Guitarra;
import com.ejercicios.modelo.InstrumentoMusical;

public class PolimorfismoInstrumentos {
    public static void main(String[] args) {
        InstrumentoMusical i1 = new Bateria("Batttery", 10);
        InstrumentoMusical i2 = new Flauta("Flautin", "madera");
        InstrumentoMusical i3 = new Guitarra("Guitarrin","Doblaas");
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = i1;
        instrumentos[1] = i2;
        instrumentos[2] = i3;
        for(InstrumentoMusical instrumento: instrumentos){
            System.out.println(instrumento.toString());
            System.out.println(instrumento.emitirSonido());
        }
    }
}
