/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.

Data atual: 29/11/2021

Autor (a): Alexandre Gonçalo

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        String mensagem = "";

            System.out.println("==============================");
            System.out.println("       PLANO CARTESIANO       ");
            System.out.println("==============================");
            System.out.print("Coordenada X: ");
                final double X_AXIS = sc.nextDouble();
            System.out.print("Coordenada Y: ");
                final double Y_AXIS = sc.nextDouble();
            System.out.println("==============================");
                if (X_AXIS > 0.0 && Y_AXIS > 0.0) {
                    mensagem = "Q1";
                } else if (X_AXIS < 0.0 && Y_AXIS > 0.0) {
                    mensagem = "Q2";
                } else if (X_AXIS < 0.0 && Y_AXIS < 0.0) {
                    mensagem = "Q3";
                } else if (X_AXIS > 0.0 && Y_AXIS < 0.0) {
                    mensagem = "Q4";
                } else {
                    mensagem = "Origem";
                }

            System.out.println("          RESULTADO           ");
            System.out.println("==============================");
            System.out.printf("%s", mensagem);

        sc.close();

    }
}
