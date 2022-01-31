/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

Autor (a): Alexandre Gonçalo

Data: 29/01/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0;

            System.out.println("===========================================");
            System.out.println("            INTERVALO DE NÚMEROS           ");
            System.out.println("===========================================");
            System.out.print("Quantidade de números que serão lidos: ");
                final int N = sc.nextInt();
            System.out.println("===========================================");

            for (int i = 0; i < N; i++) {
                int X = sc.nextInt();
                if (X >= 10 && X <= 20) {
                    in += 1;
                } else { out += 1; }
            }

            System.out.println("============================================");
            System.out.println("                  RESULTADO                 ");
            System.out.println("============================================");
            System.out.printf("%d in%n", in);
            System.out.printf("%d out%n", out);

        sc.close();

    }

}
