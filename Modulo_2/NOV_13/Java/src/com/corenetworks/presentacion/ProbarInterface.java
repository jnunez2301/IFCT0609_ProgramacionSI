package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarInterface {
    public static void main(String[] args) {
        //Polimorfismo
        IObjetoVolador i1 = new Avion("rojo");
        IObjetoVolador i2 = new Avion("azul");
        IObjetoVolador i3 = new Avion("negro");
        IObjetoVolador ave1 = new Ave();
        IObjetoVolador superman = new Superman();
        INautico bc1 = new BarCaza();
        IObjetoVolador ha = new HidroAvion();
        IObjetoVolador[] voladores = new IObjetoVolador[]{i1, i2, i3, ave1, superman, ha};
        INautico[] nauticos = new INautico[]{bc1};
        for(IObjetoVolador elemento: voladores){
            System.out.println(elemento.toString());
            System.out.println(elemento.despegar());
            System.out.println(elemento.volar());
            System.out.println(elemento.aterrizar());
            if(elemento instanceof Ave ){
                System.out.println(((Ave) elemento).ponerHUevo());
                System.out.println(((Ave) elemento).hacerNido());
            }

            if(elemento instanceof  Superman){
                System.out.println(((Superman) elemento).pararBalas());
                System.out.println(((Superman) elemento).saltarEdificio());
            }
            if(elemento instanceof HidroAvion){
                System.out.println(((HidroAvion) elemento).navegar());
                System.out.println(((HidroAvion) elemento).atracar());
            }
        }
        for(INautico elemento: nauticos){
            System.out.println(elemento.atracar());
            System.out.println(elemento.navegar());
        }

   }
}
