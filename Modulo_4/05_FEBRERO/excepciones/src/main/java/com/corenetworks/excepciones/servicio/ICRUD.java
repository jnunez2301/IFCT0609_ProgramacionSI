package com.corenetworks.excepciones.servicio;

import java.util.List;

public interface ICRUD<T, ID> {
    T registrar(T t) throws Exception;
    T modificar(T t) throws Exception;
    void eliminar(ID id) throws Exception;
    T listarPorId(ID id) throws Exception;
    List<T> listar() throws Exception;
}
