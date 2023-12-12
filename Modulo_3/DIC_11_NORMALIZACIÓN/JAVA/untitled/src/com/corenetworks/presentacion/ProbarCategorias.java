package com.corenetworks.presentacion;

import com.corenetworks.modelo.Categoria;
import netscape.javascript.JSObject;

import java.util.ArrayList;

public class ProbarCategorias {
    public static void main(String[] args) {
        ArrayList<Categoria> c1 = new ArrayList<>();
        c1.add(new Categoria(1, "Pizza", "Comida italiana"));
        c1.add(new Categoria(2, "Lejia", "Producto de limpieza"));
        c1.add(new Categoria(3, "Mozzarela", "Tipo de queso"));
        System.out.println(c1);
    }
}
