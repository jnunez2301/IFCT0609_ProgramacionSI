package com.corenetworks.presentacion;

import com.corenetworks.modelo.EstadoCivil;
import com.corenetworks.modelo.EstadoCivilAvanzado;

public class ProbarEstadoCivil {
    public static void main(String[] args) {
        EstadoCivil pepito = EstadoCivil.SOLTERO;
        System.out.println(pepito);
        EstadoCivil laura = EstadoCivil.valueOf("CASADO");
        System.out.println(laura);
        for(EstadoCivil elemento: EstadoCivil.values()){
            System.out.println("elemento -> "+elemento);
        }
        EstadoCivilAvanzado luis = EstadoCivilAvanzado.CASADO;
        System.out.println(luis);
        System.out.println("Recorriendo EstadoCivilAvanzado");
        for(EstadoCivilAvanzado elemento: EstadoCivilAvanzado.values()){
            System.out.println(elemento);
            System.out.println(elemento.getDescripcion());
            System.out.println(elemento.name());
            System.out.println(elemento.toString());
            System.out.println(elemento.ordinal());

        }
    }
}

