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
        int numConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        String nomeT = sc.nextLine();
        sc.nextLine();

        customer = new Bank(numConta, nomeT);

        System.out.print("Is there initial deposit (y/n)? ");
        char opcD = sc.next().charAt(0);
        sc.nextLine();

        if (Character.toString(opcD).matches("n")) {
            customer = new Bank(0.0);
        } else {
            System.out.print("Enter initial value: ");
            double deposito = sc.nextDouble();
            sc.nextLine();
            customer = new Bank(deposito);
        }

        System.out.println();

        System.out.println("Account data: ");
        System.out.println(customer);
    }

}
