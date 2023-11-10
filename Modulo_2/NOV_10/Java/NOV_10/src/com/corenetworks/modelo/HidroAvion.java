package com.corenetworks.modelo;

public class HidroAvion implements IObjetoVolador, INautico{
    @Override
    public String navegar() {
        return "HidroAvion esta navegando";
    }

    @Override
    public String atracar() {
        return "HidroAvion esta atracando";
    }

    @Override
    public String despegar() {
        return "HidroAvion esta despegando";
    }

    @Override
    public String volar() {
        return "HidroAvion esta volando";
    }

    @Override
    public String aterrizar() {
        return "HidroAvion esta aterrizando";
    }
}
