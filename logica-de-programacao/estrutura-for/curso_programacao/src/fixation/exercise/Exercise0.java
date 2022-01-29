/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.

Autor (a): Alexandre Gonçalo

Data: 29/01/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("          ÍMPARES DE X        ");
            System.out.println("==============================");
            System.out.print("Digite o número inteiro: ");
                final int X = sc.nextInt();
            System.out.println("==============================");
            System.out.println("           RESULTADO          ");
            System.out.println("==============================");
                for (int i = 1; i <= X; i++) {
                if ((X-i) % 2 != 0) {
                    System.out.printf("%d%n", i);
                }
            }

        sc.close();

    }

}
