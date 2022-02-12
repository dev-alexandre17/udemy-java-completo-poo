package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percentage = 0.0d;

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        skipLines();
        System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
        skipLines();
        System.out.print("Which percentage to increase salary? ");
        percentage = sc.nextDouble();
        skipLines();
        employee.increaseSalary(percentage);

        sc.close();

    }

    public static void skipLines() {
        System.out.println();
    }

}
