package com.corenetworks.modelo;

import java.util.Objects;

public class Employee {
    private int employee_id;
    private String last_name;
    private String first_name;
    private int reports_to;

    public Employee() {
    }

    public Employee(int employee_id, String last_name, String first_name, int reports_to) {
        this.employee_id = employee_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.reports_to = reports_to;
    }

    @Override
    public String toString() {
        return "\n{" +
                "employee_id=" + employee_id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", reports_to=" + reports_to +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employee_id == employee.employee_id && reports_to == employee.reports_to && Objects.equals(last_name, employee.last_name) && Objects.equals(first_name, employee.first_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, last_name, first_name, reports_to);
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getReports_to() {
        return reports_to;
    }

    public void setReports_to(int reports_to) {
        this.reports_to = reports_to;
    }
}
