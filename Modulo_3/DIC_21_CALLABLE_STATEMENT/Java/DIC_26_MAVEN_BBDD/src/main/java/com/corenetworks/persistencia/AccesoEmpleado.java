package com.corenetworks.persistencia;

import com.corenetworks.modelo.Employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoEmpleado extends Conexion{

     public String infoEmpleado(Employee e1) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        ResultSet resultado = null;

        String sql = "SELECT * FROM employees WHERE employee_id = ?;";

        abrirConexion();

        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, e1.getEmployee_id());

        resultado = sentencia.executeQuery();

        if(resultado.next()){
            int employeeId = resultado.getInt("employee_id");
            String firstName = resultado.getString("first_name");
            String lastName = resultado.getString("last_name");
            int reportsTo = resultado.getInt("reports_to");
            return new Employee(employeeId, lastName, firstName, reportsTo).toString();
        }

        return "No se encontró ningún empleado con el ID: " + e1.getEmployee_id();
    }

    public List<Employee> empresaEmpleados() throws SQLException, ClassNotFoundException {

         Statement sentencia = null;
         ResultSet resultado = null;
         String sql = "SELECT * FROM employees";
         List<Employee> empleados = new ArrayList<>();
         abrirConexion();

         sentencia = miConexion.createStatement();
         resultado = sentencia.executeQuery(sql);

         while (resultado.next()){
            int employeeId = resultado.getInt("employee_id");
            String firstName = resultado.getString("first_name");
            String lastName = resultado.getString("last_name");
            int reportsTo = resultado.getInt("reports_to");
            empleados.add(new Employee(employeeId, lastName, firstName, reportsTo));
         }
        return empleados;
    }

    public boolean insertarEmpleado(Employee e1) throws SQLException, ClassNotFoundException {
         PreparedStatement sentencia;
         String sql = "INSERT INTO employees(employee_id, last_name, first_name, reports_to) VALUES (?, ?, ?, ?);";
         int resultado = 0;

         abrirConexion();

         sentencia = miConexion.prepareStatement(sql);
         sentencia.setInt(1, e1.getEmployee_id());
         sentencia.setString(2, e1.getLast_name());
         sentencia.setString(3, e1.getFirst_name());
         sentencia.setInt(4, e1.getReports_to());
         resultado = sentencia.executeUpdate();

         return resultado > 0;
    }
    public boolean eliminarEmpleado(Employee e1) throws SQLException, ClassNotFoundException {
         PreparedStatement setencia;
         String sql = "DELETE FROM employees WHERE employee_id = ?;";
         int resultado = 0;

         abrirConexion();

         setencia = miConexion.prepareStatement(sql);
         setencia.setInt(1, e1.getEmployee_id());

         resultado = setencia.executeUpdate();

         return resultado > 0;
    }
    public boolean actualizarEmpleado(Employee e1) throws SQLException, ClassNotFoundException {
         PreparedStatement sentencia;
         String sql = "UPDATE employees SET last_name = ?, first_name = ?, reports_to = ? WHERE employee_id = ?;";
         int resultado = 0;

         abrirConexion();

         sentencia = miConexion.prepareStatement(sql);
         sentencia.setString(1, e1.getLast_name());
         sentencia.setString(2, e1.getFirst_name());
         sentencia.setInt(3, e1.getReports_to());
         sentencia.setInt(4, e1.getEmployee_id());

         resultado = sentencia.executeUpdate();

         return resultado > 0;
    }
}
