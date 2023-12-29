package com.corenetworks.modelo;

import jdk.jfr.DataAmount;

@DataAmount
public class CalculadoraMonetaria {
    // Dollars a euros
    public static double dollarEuro(double dollar){
        return dollar * 0.9;
    }
}