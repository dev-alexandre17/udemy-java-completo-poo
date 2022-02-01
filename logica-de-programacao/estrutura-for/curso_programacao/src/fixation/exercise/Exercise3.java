/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

Autor (a): Alexandre Gonçalo

Data: 01/02/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("============================");
            System.out.println("     DIVISÕES DE VALORES    ");
            System.out.println("============================");
            System.out.print("Números que serão lidos: ");
                final int N = sc.nextInt();
            System.out.println("==========================");

                for (int i = 0; i < N; i++) {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("===========================");
                    System.out.println("         RESUTALDO         ");
                    System.out.println("===========================");
                    if (y == 0) {
                        System.out.println("divisao impossivel");
                    } else {
                        System.out.printf("%.1f%n", (double) x/y);
                    }
                    System.out.println("===========================");
                }

        sc.close();

    }

}
