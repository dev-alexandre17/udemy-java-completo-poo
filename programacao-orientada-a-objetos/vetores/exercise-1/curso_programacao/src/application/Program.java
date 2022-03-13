package application;

import entities.Rent;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rent customer;

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        double[] vect = new double[9];

        for (int i = 0; i < rooms; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d%n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
        }

        sc.close();

    }

}
