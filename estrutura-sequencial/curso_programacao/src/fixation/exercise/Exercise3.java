/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Autor (a): Alexndre Gonçalo

Data atual: 11/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("=================================");
            System.out.println("      DIFERENÇA DO PRODUTO       ");
            System.out.println("=================================");
            System.out.print("Primeiro valor inteiro: ");
                final int A = sc.nextInt();
            System.out.print("Segundo valor inteiro: ");
                final int B = sc.nextInt();
            System.out.print("Terceiro valor inteiro: ");
                final int C = sc.nextInt();
            System.out.print("Quarto valor inteiro: ");
                final int D = sc.nextInt();
            System.out.println("=================================");
            System.out.println("            RESULTADO            ");
            System.out.println("=================================");
            System.out.printf("DIFERENCA = %d%n", (A * B - C * D));

        sc.close();

    }

}
