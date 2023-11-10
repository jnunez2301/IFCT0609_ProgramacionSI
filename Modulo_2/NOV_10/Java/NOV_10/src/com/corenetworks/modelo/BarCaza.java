package com.corenetworks.modelo;
public class BarCaza implements INautico{
    @Override
    public String navegar() {
        return "Barcaza esta navegando";
    }

    @Override
    public String atracar() {
        return "Barcaza esta atracando";
    }
}
