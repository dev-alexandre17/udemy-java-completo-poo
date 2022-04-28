package application;

import entities.Rent;

import java.util.Scanner;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rent customer;

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        double[] vect = new double[9];

        for (int i = 1; i < rooms + 1; i++) {
            System.out.println();
            System.out.printf("Rent #%d%n", i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.next();
            System.out.print("Email: ");
            String email = sc.nextLine();
            sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
        }

        // Vetor para armazenar nome e email
        // Método sort para ordenar informações

        sc.close();

    }

}
