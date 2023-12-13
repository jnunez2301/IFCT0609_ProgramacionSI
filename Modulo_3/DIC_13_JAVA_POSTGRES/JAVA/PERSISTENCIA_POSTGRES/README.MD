# CONECTAR CON POSTGRESQL UTILIZANDO EL DRIVER JDBC – JAVA POSTGRESQL JDBC
 
JDBC- JAVA DATA BASE CONNECTION

[Postgres con Java](https://codigoxules.org/conectar-postgresql-utilizando-driver-jdbc-java-postgresql-jdbc/#establecemos-conexion-generica)

## Si no te acuerdas de la contraseña de tu BD

Ejecutar en la BD postgres

```ALTER USER postgres WITH PASSWORD 'postgres'```

## Pasos iniciales

Al abrir un nuevo proyecto se debe crear un paquete con 3 capas

* Persistencia
* Modelo
* Presentación

## Añadir el driver al proyecto

1. Click derecho en el proyecto
2. Open Module Settings
3. Darle al botón + y luego añadir Jar
4. Después en external libraries debe aparecer el driver de postgres en nuestro caso "r__postgresql42.7.1_1702469517.jar"

## Crear conexión

En la capa persistencia se debe crear una clase de esta manera
```
package com.corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
protected Connection miConexion;

    public Conexion() {}

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                // 127.0.0.1 siempre pertenece al localhost
                "jdbc:postgresql://127.0.0.1:5432/Northwind2",
                "postgres", "jhon2301");
                // username, password
        System.out.println("Exito al abrir la conexión");
    }
}
```
## Probando la conexión
Luego podemos probar la conexión en la capa de presentación
```
package com.corenetworks.presentacion;

import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarConexion {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try{
            c1.abrirConexion();
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch(SQLException e){
            System.out.println(e.toString());
        }
    }
}
```
## Modelo | Scheme

En el apartado modelo se crea una clase parecida a esta
```
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
        return "Producto{" +
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
```

## Petición SQL

En **persistencia** creamos una clase para el acceso, en este caso será
**AccesoProducto**

```
package com.corenetworks.persistencia;

import com.corenetworks.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoProducto extends Conexion{
    public Producto obtener1(int id) throws SQLException, ClassNotFoundException {
        
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT product_id, product_name, unit_price, units_in_stock FROM products WHERE product_id = " + id;
        Producto p1 = null;
        // IMPORTANTE! Abrir la conexión o no funcionará
        // ya que la misma clase extiende Conexión no hace falta inicializar
        abrirConexion();

        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        // resultado.next() retorna true o false
        if(resultado.next()){
            int idProducto = resultado.getInt("product_id");
            String nombre = resultado.getString("product_name");
            double precioUnitario = resultado.getDouble("unit_price");
            int unidadesStock = resultado.getInt("units_in_stock");
            p1 = new Producto(idProducto, nombre, precioUnitario, unidadesStock);
            return p1;
        }
        return p1;
    }
}

```

## Probando AccesoProducto
```
package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProducto;
import com.corenetworks.persistencia.Conexion;
import java.sql.SQLException;

public class ProbarConexion {
    public static void main(String[] args) {
        /*
        Debido a que en AccesoProducto ya usamos abrirConexion() es innecesario este paso
        
        Conexion c1 = new Conexion();

        try{
            c1.abrirConexion();
        }catch(ClassNotFoundException e){
            throw new RuntimeException(e);
        }catch(SQLException e){
            System.out.println(e.toString());
        }*/
        AccesoProducto aP1 = new AccesoProducto();
        try{
            System.out.println(aP1.obtener1(5));
        }catch (SQLException | ClassNotFoundException e){
            System.out.println(e.toString());
        }
    }
}
```

## Simplificando AccesoProducto

```
public class AccesoProducto extends Conexion{
    public Producto obtener1(int id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT product_id, product_name, unit_price, units_in_stock FROM products WHERE product_id = " + id;
        
        abrirConexion();
        
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        if(resultado.next()){
            // Simplificado
            return new Producto(resultado.getInt("product_id"),resultado.getString("product_name"), resultado.getDouble("unit_price"),resultado.getInt("units_in_stock"));
        }
        return null;
    }
}
```
## Obteniendo todos los productos

```
public List<Producto> obtenerTodos() throws SQLException, ClassNotFoundException {

        // Abrir conexión
        Statement sentencia;
        ResultSet resultado;
        String sql = "SELECT product_id, product_name, unit_price, units_in_stock FROM products";
        abrirConexion();
        List<Producto> productos = new ArrayList<>();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        // En este caso hace bucle con todas las filas de la query
        while(resultado.next()){
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock")));
        }
        return productos;
    }
```
