/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.

Autor (a): Alexandre Gonçalo

Data: 02/02/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("==============================");
            System.out.println("   MULTIPLICAÇÕES DE NÚMEROS  ");
            System.out.println("==============================");
            System.out.print("Digite um valor: ");
                int N = sc.nextInt();
            System.out.println("==============================");
            System.out.println("           RESULTADO          ");
            System.out.println("==============================");
                for (int i = 1; i <= N; i++) {
                    System.out.printf("%d %d %d%n", i, (i*i), (i*i*i));
                }

        sc.close();

    }

}
