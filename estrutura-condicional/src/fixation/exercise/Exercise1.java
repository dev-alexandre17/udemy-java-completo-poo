/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

Autor (a): Alexandre Gonçalo

Data atual: 19/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("         NÚMEROS PARES        ");
            System.out.println("==============================");
            System.out.print("Informe um valor inteiro: ");
                final int number = sc.nextInt();
            System.out.println("==============================");
            System.out.println("           RESULTADO          ");
            System.out.println("==============================");
            System.out.println((number % 2 == 0) ? "PAR" : "IMPAR");

        sc.close();

    }

}
