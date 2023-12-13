# CONECTAR CON POSTGRESQL UTILIZANDO EL DRIVER JDBC – JAVA POSTGRESQL JDBC

Se sigue este tutorial para crear la conexión

[Postgres con Java](https://codigoxules.org/conectar-postgresql-utilizando-driver-jdbc-java-postgresql-jdbc/#establecemos-conexion-generica)

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
