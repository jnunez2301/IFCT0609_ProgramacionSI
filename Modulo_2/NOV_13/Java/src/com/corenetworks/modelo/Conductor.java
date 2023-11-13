package com.corenetworks.modelo;

public class Conductor implements IVehiculo{
    private IVehiculo vehiculo;
    public String conducir(){
        return vehiculo.moverse();
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "vehiculo=" + vehiculo +
                '}';
    }

    @Override
    public String moverse() {
        return "Conductor moviendose";
    }
    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


}
