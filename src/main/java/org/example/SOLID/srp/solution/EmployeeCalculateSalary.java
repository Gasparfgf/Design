package org.example.SOLID.srp.solution;

public class EmployeeCalculateSalary {
    private double salary;

    public EmployeeCalculateSalary(double salary) {
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}