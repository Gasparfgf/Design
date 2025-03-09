package org.example.SOLID.srp.solution;

public class EmployeeInfo {
    private String name;
    
    public EmployeeInfo(String name) {
        this.name = name;
    }

    public void printEmployeeDetails() {

        EmployeeCalculateSalary salary = new EmployeeCalculateSalary(1315.89);
        System.out.println("Nom : " + name + ", Salaire : " + salary.calculateAnnualSalary());
    }
}