/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Autor (a): Alexandre Gonçalo

Data atual: 10/01/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("=========================");
            System.out.println("       QUADRANTES        ");
            System.out.println("=========================");
            System.out.print("Eixo x: ");
                int xAxis = sc.nextInt();
            System.out.print("Eixo y: ");
                int yAxis = sc.nextInt();
            System.out.println("=========================");
            System.out.println("         RESULTADO       ");
            System.out.println("=========================");
                while (xAxis != 0 && yAxis != 0) {
                    if (xAxis > 0 && yAxis > 0) {
                        System.out.println("primeiro");
                        break;
                    } else if (xAxis < 0 && yAxis > 0) {
                        System.out.println("segundo");
                        break;
                    } else if (xAxis < 0 && yAxis < 0) {
                        System.out.println("terceiro");
                        break;
                    } else {
                        System.out.println("quarto");
                        break;
                    }
                }
            System.out.println("=========================");

        sc.close();

    }

}
