/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Autor (a): Alexandre Gonçalo

Data atual: 19/11/2021

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("======================");
            System.out.println("   DURAÇÃO DO JOGO    ");
            System.out.println("======================");
            System.out.print("Hora inicial: ");
                final int beginH = sc.nextInt();
            System.out.print("Hora final: ");
                final int endH = sc.nextInt();
            System.out.println("======================");
            System.out.println("       RESULTADO      ");
            System.out.println("======================");

        sc.close();

    }
}
