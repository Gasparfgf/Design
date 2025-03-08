/**
 * Tu as la classe suivante qui gère à la fois les informations d'un employé et son calcul de salaire.
 * Refactorise-la en suivant SRP (Single Responsibility Principle).
 * */
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Nom : " + name + ", Salaire : " + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}
