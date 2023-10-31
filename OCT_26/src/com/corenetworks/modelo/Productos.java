package com.corenetworks.modelo;

public class Productos {
    //Atributos

    //Los atributos siempre deben ser declarados como privados
    private int idProducto;
    private String nombre;
    private int cantidadExistencias;
    private int telefono;
    private int cantidadEmpleados;


    //Getter y Setter
    //El void(vació) se usa para no devolver un valor
    //Los setters y Getters deben ser públicos
    //Los setter siempre asignan un valor
    /*
    public void setNombreDeAtributo(<tipo> argumento){
        ...tu código
    }
    */
    public void setIdProducto(int valor){
        idProducto = valor;
    };

    public void setNombre(String nombre){
        //This se refiere al atributo que asignamos en la linea 6.
      this.nombre = nombre;
    };

    public void setCantidadExistencias(int cantidadExistencias){
      this.cantidadExistencias = cantidadExistencias;
    };

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public void setCantidadEmpleados(int cantidadEmpleados){
        this.cantidadEmpleados = cantidadEmpleados;
    }
    //Getters
    //Estos siempre retornan valores
    /*
    public <tipo_de_dato> [nombre](){
    ...tu código
     }
     */
    public int getIdProducto(){
        return idProducto;
    }
    public String getNombre(){
        //Siempre usar return para devolver el valor que queremos
        //En este caso es nombre ya que es getNombre
        // "Obtener nombre" -> "retorna nombre"
        return nombre;
    }

    public int getCantidadExistencias(){
        return cantidadExistencias;
    }

    public int getTelefono(){
        return telefono;
    }
    public int getCantidadEmpleados(){
        return cantidadEmpleados;
    }
}
