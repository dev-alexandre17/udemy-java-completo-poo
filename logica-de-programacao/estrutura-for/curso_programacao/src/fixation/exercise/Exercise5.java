/* Ler um número inteiro N e calcular todos os seus divisores.

Autor (a): Alexandre Gonçalo

Data: 02/02/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("===============================");
            System.out.println("    DIVISORES DE UM NÚMERO     ");
            System.out.println("===============================");
            System.out.print("Informe um número: ");
                final int N = sc.nextInt();
            System.out.println("===============================");
            System.out.println("           RESULTADO           ");
            System.out.println("===============================");
                for (int i = 1; i <= N; i++) {
                    if (N % i == 0) {
                        System.out.println(i);
                    }
                }

        sc.close();

    }

}
