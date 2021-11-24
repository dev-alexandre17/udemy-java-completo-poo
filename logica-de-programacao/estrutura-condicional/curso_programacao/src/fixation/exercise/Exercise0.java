/* Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

Autor (a): Alexandre Gonçalo

Data atual: 19/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("==================================");
            System.out.println("       NÚMEROS INTEIROS (N)       ");
            System.out.println("==================================");
            System.out.print("Digite um número inteiro: ");
                final int number = sc.nextInt();
            System.out.println("==================================");
            System.out.println("             RESULTADO            ");
            System.out.println("==================================");
            System.out.println((number >= 0) ? "NAO NEGATIVO" : "NEGATIVO");

        sc.close();

    }

}