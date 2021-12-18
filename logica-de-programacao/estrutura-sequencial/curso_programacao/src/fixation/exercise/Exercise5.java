/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

Autor (a): Alexandre Gonçalo

Data atual: 12/11/2021

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

            System.out.println("=================================");
            System.out.println("       VALOR TOTAL DE PEÇAS      ");
            System.out.println("=================================");
            System.out.print("Código da peça 1: ");
                final int COD_PEC_ONE = sc.nextInt();
            System.out.print("Número da peças 1: ");
                final int NUM_PEC_ONE = sc.nextInt();
            System.out.print("Valor unitário da peça 1: ");
                final double VALUE_U_PEC_ONE = sc.nextDouble();
            System.out.println("=================================");
            System.out.print("Código da peça 2: ");
                final int COD_PEC_Two = sc.nextInt();
            System.out.print("Número de peças 2: ");
                final int NUM_PEC_TWO = sc.nextInt();
            System.out.print("Valor unitário da peça 2: ");
                final double VALUE_U_PEC_TWO = sc.nextDouble();
            System.out.println("=================================");
            System.out.println("            RESULTADO            ");
            System.out.println("=================================");
            System.out.printf("VALOR A PAGAR: R$ %.2f%n", ((NUM_PEC_ONE * VALUE_U_PEC_ONE) + (NUM_PEC_TWO * VALUE_U_PEC_TWO)));

        sc.close();

    }

}