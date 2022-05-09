package application;

import entities.Rent;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] roomNumbers = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rooms = sc.nextInt();

        for (int i = 1; i <= rooms; i++) {
            System.out.println();
            System.out.printf("Rent #%d%n", i);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            roomNumbers[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");

        for (int y = 0; y < roomNumbers.length; y++) {
            if (roomNumbers[y] != null) {
                System.out.println(y + ": " + roomNumbers[y]);
            }
        }

        sc.close();

    }

}
