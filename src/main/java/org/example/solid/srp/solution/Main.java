package org.example.SOLID.srp.solution;

public class Main {

    public static void main(String[] args) {
        EmployeeCalculateSalary salary = new EmployeeCalculateSalary(1315.89);
        EmployeeInfo employeeInfo = new EmployeeInfo("Gaspar", salary.calculateAnnualSalary());
        employeeInfo.printEmployeeDetails();
    }
}