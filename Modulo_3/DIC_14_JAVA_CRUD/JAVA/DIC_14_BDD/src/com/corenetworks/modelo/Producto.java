package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    // El nombre puede ser cualquiera, pero por costumbre se utiliza el mismo que en la BDD.
    private int product_id;
    private String product_name;
    private double unit_price;
    private int units_in_stock;

    public Producto() {}

    public Producto(int product_id, String product_name, double unit_price, int units_in_stock) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.units_in_stock = units_in_stock;
    }

    @Override
    public String toString() {
        return "\n{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", unit_price=" + unit_price +
                ", units_in_stock=" + units_in_stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return product_id == producto.product_id && Double.compare(producto.unit_price, unit_price) == 0 && units_in_stock == producto.units_in_stock && Objects.equals(product_name, producto.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, product_name, unit_price, units_in_stock);
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public int getUnits_in_stock() {
        return units_in_stock;
    }

    public void setUnits_in_stock(int units_in_stock) {
        this.units_in_stock = units_in_stock;
    }
}