package com.corenetworks.modelo;

import java.lang.reflect.Array;

public class Mensaje {

    //Constructor
    //public/private NOMBRE_CLASE(parametro){ ...CONTENIDO }
    //SIEMPRE DECLARAR UN CONSTRUCTOR VACIÓ PARA FRAMEWORKS
    public Mensaje(){}
    public Mensaje(String saludo, String ipOrigen, String ipDestino){
        this.saludo = saludo;
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
    }
    /*
    Y se usaria como
    Mensaje msj = new Mensaje("dato", "otro_dato");
    Por lo tanto nos ahorramos un setter
    * */



    //Atributos
    private String saludo;
    private String ipOrigen;
    private String ipDestino;
    //Setters
    public void setSaludo(String saludo){
        this.saludo = saludo;
    }
    public void setIpOrigen(String ipOrigen){
        this.ipOrigen = ipOrigen;
    }
    public void setIpDestino(String ipDestino){
        this.ipDestino = ipDestino;
    }
    //Getters

    public String getSaludo(){
        return saludo;
    }
    public String getIpOrigen(){
        return ipOrigen;
    }
    public String getIpDestino(){
        return ipDestino;
    }
    public int calcularNumeroPalabras(){

        String[] arr = saludo.trim().split(" ");
        return arr.length;

    }
    public String mostrarInfo(){

        return "\n Saludo: " + saludo
                + "\n ipOrigen: " + ipOrigen
                + "\n ipDestino: " + ipDestino
                + "\n Numero de palabras: " + calcularNumeroPalabras()
                ;
    }
}
