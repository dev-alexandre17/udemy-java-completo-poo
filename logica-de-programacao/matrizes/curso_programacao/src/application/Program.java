package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int m = sc.nextInt();
            int n = sc.nextInt();

            int matrix[][] = new int[m][n];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int x = sc.nextInt();

            // Descobrir a posição de um elemento na matriz

            for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   if (matrix[i][j] == x) {
                       System.out.println("Position: " + i + "," + j);
                   }
               }
            }

        sc.close();

    }

}
