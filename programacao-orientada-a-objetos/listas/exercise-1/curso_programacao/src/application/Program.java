package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();

        Employee employee = null;

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

            Employee employee1 = list.stream().filter(z -> z.getId() == id_employee).findFirst().orElse(null);

            if (employee1 == null) {
                System.out.println("This id doesn't exist\n");
            } else {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                employee1.increaseSalary(percentage);
                System.out.println();
            }

            System.out.println("List of employees: ");
                for (Employee emp : list) {
                    System.out.println(emp);
            }

        sc.close();

    }

}
