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

            final int N = sc.nextInt();

            // PROBLEMA NO CÓDIGO

            /* for (int i = 10; i <= 20; i++) {
                if (N >= 10 && N <= 20) { in += 1; } else { out += 1; }
            } */

        System.out.printf("%d in%n", in);
        System.out.printf("%d out%n", out);

        sc.close();

    }

}
