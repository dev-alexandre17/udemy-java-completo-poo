package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Press M: ");
            int m = sc.nextInt();

            System.out.print("Press N: ");
            int n = sc.nextInt();

            System.out.println();

            int matrix[][] = new int[m][n];
            int position;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println();

            System.out.print("Press X: ");
            int x = sc.nextInt();

            System.out.println();

            // Descobrir a posição de um elemento na matriz

            for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   if (matrix[i][j] == x) {
                       System.out.println("Position: " + i + "," + j);
                       if (j > 0) {
                           System.out.println("Left: " + matrix[i][j - 1]);
                       }
                       if (i > 0) {
                           System.out.println("Up: " + matrix[i-1][j]);
                       }
                   }
               }
            }

        sc.close();

    }

}
