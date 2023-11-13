package com.corenetworks.ejercicios.modelo;

public class ClienteDao {
    private IDAO conexion;
    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

    @Override
    public String toString() {
        return "ClienteDao{" +
                "conexion=" + conexion +
                '}';
    }

    public ClienteDao() {
    }

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
