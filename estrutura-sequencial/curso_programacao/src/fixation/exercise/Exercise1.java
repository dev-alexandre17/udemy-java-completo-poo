/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
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
                final int numberOne = sc.nextInt();
            System.out.print("Informe outro valor inteiro: ");
                final int numberTwo = sc.nextInt();
            System.out.println("================================");
            System.out.println("           RESULTADO            ");
            System.out.println("================================");
            System.out.printf("SOMA = %d", (numberOne+numberTwo));

            sc.close();

    }

}
