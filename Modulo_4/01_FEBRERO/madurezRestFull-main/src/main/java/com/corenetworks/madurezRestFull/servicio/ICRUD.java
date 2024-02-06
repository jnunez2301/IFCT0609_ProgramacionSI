package com.corenetworks.madurezRestFull.servicio;

import com.corenetworks.madurezRestFull.modelo.ConsultaMedica;

import java.util.List;

public interface ICRUD<T,ID>{
    T crear(T t);
    T modificar(T t);
    void eliminar(ID id);

    T consultaUno(ID id);
    List<T> consultaTodos();
}
