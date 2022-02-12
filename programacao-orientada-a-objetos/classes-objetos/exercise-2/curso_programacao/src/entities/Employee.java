package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return (grossSalary - tax);
    }

    public void increaseSalary(double percentage) {
        double newIncreaseSalary = ((grossSalary * (percentage / 100)));
        double newGrossSalary = ((grossSalary + newIncreaseSalary) - tax);
        System.out.printf("Updated data: %s, $ %.2f%n", name, newGrossSalary);
    }

}
