package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        Employee employee;

        Scanner sc = new Scanner(System.in);

            System.out.print("How many employees will be registered? ");
            int employees = sc.nextInt();
            System.out.println();

            for (int i = 1; i <= employees; i++) {
                System.out.println("Employee #" + i + ":");
                System.out.print("Id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
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

            System.out.println("List of employees: ");
            for (Employee emp : list) {
                System.out.println(emp);
            }


        sc.close();

    }

}
