package com.corenetworks.modelo;

import java.util.Objects;

public class Fecha {
    int ano;
    int mes;
    int dia;

    @Override
    public String toString() {
        return "Fecha{" +
                "año=" + ano +
                ", mes=" + mes +
                ", dia=" + dia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return ano == fecha.ano && mes == fecha.mes && dia == fecha.dia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, mes, dia);
    }

    public Fecha(){}

    public Fecha(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }else{
            throw new Exception("Mes no esta dentro del rango");
        }
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if(dia > 0 && dia < 31){
            this.dia = dia;
        }else{
            throw new Exception("Dia debe estar entre 1 y 30");
        }
    }
}
