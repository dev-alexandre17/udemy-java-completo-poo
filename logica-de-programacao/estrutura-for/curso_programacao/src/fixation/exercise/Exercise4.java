/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

Autor (a): Alexandre Gonçalo

Data: 01/02/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            int factorial = 1;

                System.out.println("==============================");
                System.out.println("            FATORIAL          ");
                System.out.println("==============================");
                System.out.print("Informe um número:");
                    final int N = sc.nextInt();

                    for (int i = 1; i <= N; i++) {
                        factorial *= i;
                    }

                System.out.println("==============================");
                System.out.println("           RESULTADO          ");
                System.out.println("==============================");
                System.out.println(factorial);

        sc.close();

    }

}
