package org.example.SOLID.srp.solution;

public class EmployeeInfo {
    private String name;
    private double salary;
    
    public EmployeeInfo(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Nom : " + name + ", Salaire : " + salary);
    }
}