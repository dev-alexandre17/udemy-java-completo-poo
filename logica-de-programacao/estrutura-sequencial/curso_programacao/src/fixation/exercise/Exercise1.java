/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.

Autor (a): Alexandre Gonçalo

Data atual: 11/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("================================");
            System.out.println("        SOMA DE NÚMEROS         ");
            System.out.println("================================");
            System.out.print("Informe um valor inteiro: ");
                final int NUMBER_ONE = sc.nextInt();
            System.out.print("Informe outro valor inteiro: ");
                final int NUMBER_TWO = sc.nextInt();
            System.out.println("================================");
            System.out.println("           RESULTADO            ");
            System.out.println("================================");
            System.out.printf("SOMA = %d", (NUMBER_ONE+NUMBER_TWO));

            sc.close();

    }

}
