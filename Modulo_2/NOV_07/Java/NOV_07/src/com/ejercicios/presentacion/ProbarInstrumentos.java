package com.ejercicios.presentacion;

import com.ejercicios.modelo.Bateria;
import com.ejercicios.modelo.Flauta;
import com.ejercicios.modelo.Guitarra;

public class ProbarInstrumentos {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("Mamalona", "cuerdisimas");
        System.out.println(g1.toString());
        System.out.println(g1.emitirSonido());

        Bateria b1 = new Bateria("Battery!", 2);
        System.out.println(b1.toString());
        System.out.println(b1.emitirSonido());

        Flauta f1 = new Flauta("Ocarina", "madera");
        System.out.println(f1.toString());
        System.out.println(f1.emitirSonido());
    }

}
