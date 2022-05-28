package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        Employee employee;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

            System.out.print("How many employees will be registered? ");
            int employees = sc.nextInt();
            System.out.println();

            for (int i = 1; i <= employees; i++) {
                System.out.println("Employee #" + i + ":");
                System.out.print("Id: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.nextLine();
                sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                System.out.println();
                employee = new Employee(id, name, salary);
                list.add(employee);
            }

            System.out.print("Enter the employee id that will have salary increase: ");
            int id_employee = sc.nextInt();

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();

            System.out.println();

        sc.close();

    }

}
