/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

Autor (a): Alexandre Gonçalo

Data atual: 19/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("====================================");
            System.out.println("       MÚLTIPLOS DE UM NÚMERO       ");
            System.out.println("====================================");
            System.out.print("Número inteiro: ");
                final int INTEGER_NUMBER_A = sc.nextInt();
            System.out.print("Outro número inteiro: ");
                final int INTEGER_NUMBER_B = sc.nextInt();
            System.out.println("====================================");
            System.out.println("             RESULTADO              ");
            System.out.println("====================================");
            System.out.println(((INTEGER_NUMBER_A % INTEGER_NUMBER_B == 0) || (INTEGER_NUMBER_B % INTEGER_NUMBER_A == 0))
            ? "Sao Multiplos" : "Nao sao Multiplos");

        sc.close();

    }

}