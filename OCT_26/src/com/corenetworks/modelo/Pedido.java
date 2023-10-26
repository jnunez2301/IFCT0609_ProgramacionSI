package com.corenetworks.modelo;

public class Pedido {
    //Atributos
    private int idPedido;
    private double importe;
    private char formaPago;
    private double IVA;
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
    public void setIVA(double porcentaje){
        this.IVA = porcentaje;
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
    public double calcularIVA(){
        return ( importe * (IVA/100 + 1)  );
    }

    public String mostrarInfo(){
        return "\n ID PEDIDO: " + idPedido
                + "\n IMPORTE: " + importe + " €"
                + "\n FORMADE PAGO: " + getFormaPago()
                + "\n IVA " + IVA + " %"
                + "\n TOTAL: " + calcularIVA()
                ;
    }

}
