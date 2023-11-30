package com.corenetworks.modelo;

public class Dado {
    private double aletorio = Math.ceil(Math.random() * 6);
    private String dibujarUno = "*";
    private String dibujarDos = "* *";
    private String dibujarTres = "*\n * *";
    private String dibujarCuatro = "* *\n * *";
    private String dibujarCinco = "* *\n * \n * *";
    private String dibujarSeis = "* * *\n * * *";

    public Dado() {
    }
    public String lanzar(){
        String dadoLanzado = "";
        switch ((int) aletorio){
            case 1:
                dadoLanzado = dibujarUno;
                break;
            case 2:
                dadoLanzado = dibujarDos;
                break;
            case 3:
                dadoLanzado = dibujarTres;
                break;
            case 4:
                dadoLanzado = dibujarCuatro;
                break;
            case 5:
                dadoLanzado = dibujarCinco;
                break;
            case 6:
                dadoLanzado = dibujarSeis;
                break;
        }
        return dadoLanzado;
    }
    public double getAletorio() {
        return aletorio;
    }

    public void setAletorio(double aletorio) {
        this.aletorio = aletorio;
    }

    public String getDibujarUno() {
        return dibujarUno;
    }

    public void setDibujarUno(String dibujarUno) {
        this.dibujarUno = dibujarUno;
    }

    public String getDibujarDos() {
        return dibujarDos;
    }

    public void setDibujarDos(String dibujarDos) {
        this.dibujarDos = dibujarDos;
    }

    public String getDibujarTres() {
        return dibujarTres;
    }

    public void setDibujarTres(String dibujarTres) {
        this.dibujarTres = dibujarTres;
    }

    public String getDibujarCuatro() {
        return dibujarCuatro;
    }

    public void setDibujarCuatro(String dibujarCuatro) {
        this.dibujarCuatro = dibujarCuatro;
    }

    public String getDibujarCinco() {
        return dibujarCinco;
    }

    public void setDibujarCinco(String dibujarCinco) {
        this.dibujarCinco = dibujarCinco;
    }

    public String getDibujarSeis() {
        return dibujarSeis;
    }

    public void setDibujarSeis(String dibujarSeis) {
        this.dibujarSeis = dibujarSeis;
    }
}

