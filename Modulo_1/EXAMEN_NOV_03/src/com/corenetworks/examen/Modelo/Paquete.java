package com.corenetworks.examen.Modelo;

public class Paquete {
    // Atributos
    private String ipOrigen;
    private String ipDestino;
    private String mensaje;
    private int contadorPaquetes;


    // Constructor
    public Paquete() {}

    public Paquete(String ipOrigen, String ipDestino, String mensaje, int contadorPaquetes) {
        this.ipOrigen = ipOrigen;
        this.ipDestino = ipDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;

    }



    public String getIpOrigen() {
        return ipOrigen;
    }

    public void setIpOrigen(String ipOrigen) {
        this.ipOrigen = ipOrigen;
    }

    public String getIpDestino() {
        return ipDestino;
    }

    public void setIpDestino(String ipDestino) {
        this.ipDestino = ipDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString(){
        return "\n ipOrigen ->" + ipOrigen
                + "\n ipDestino ->" + ipDestino
                + "\n Mensaje ->" + mensaje
                + "\n Paquetes ->" + contadorPaquetes;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}
