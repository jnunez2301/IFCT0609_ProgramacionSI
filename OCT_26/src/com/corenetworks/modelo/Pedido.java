package com.corenetworks.modelo;

public class Pedido {
    //Atributos
    private int idPedido;
    private double importe;
    private char formaPago;
    //Setters
    public void setIdPedido(int idPedido){
        this.idPedido = idPedido;
    }
    public void setImporte(double importe){
        this.importe = importe;
    }
    public void setFormaPago(char formaPago){
        this.formaPago = formaPago;
    }

    //Getters
    public int getIdPedido(){
        return idPedido;
    }
    public double getImporte(){
        return importe;
    }
    public String getFormaPago(){
        if(formaPago == 'e'){
            return "Efectivo";
        }else if(formaPago == 't'){
            return "Tarjeta";
        }else{
            return "NO ESPECIFICADA";
        }
    }
    public double getIVA(){
        return this.importe * 0.21;
    }


}
