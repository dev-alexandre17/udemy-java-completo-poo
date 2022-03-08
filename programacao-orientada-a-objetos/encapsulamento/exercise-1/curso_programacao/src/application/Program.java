package application;

import entities.Bank;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bank customer;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String titularName = sc.nextLine();

        System.out.print("Is there initial deposit (y/n)? ");
        char optionalDeposit = sc.next().charAt(0);
        sc.nextLine();

        if (Character.toString(optionalDeposit).matches("y")) {
            System.out.print("Enter initial value: ");
            double deposit = sc.nextDouble();
            sc.nextLine();
            customer = new Bank(accountNumber, titularName, deposit);
        } else {
            customer = new Bank(accountNumber, titularName, 0.0);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(customer);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        customer.deposit(depositAmount);
        System.out.println("Updated account data: ");
        System.out.println(customer);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawalAmount = sc.nextDouble();
        customer.saque(withdrawalAmount);
        System.out.println("Updated account data: ");
        System.out.println(customer);

    }

}
