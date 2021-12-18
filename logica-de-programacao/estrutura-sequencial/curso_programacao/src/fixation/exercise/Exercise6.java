/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Autor (a): Alexandre Gonçalo

Data atual: 15/11/2021

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("===========================");
            System.out.println("     ÁREAS GEOMÉTRICAS     ");
            System.out.println("===========================");
            System.out.print("Valor flutuante A: ");
                final double FLOATING_VALUE_A = sc.nextDouble();
            System.out.print("Valor flutuante B: ");
                final double FLOATING_VALUE_B = sc.nextDouble();
            System.out.print("Valor flutuante C: ");
                final double FLOATING_VALUE_C = sc.nextDouble();
            System.out.println("===========================");
            System.out.println("         RESULTADO         ");
            System.out.println("===========================");
            System.out.printf("TRIANGULO: %.3f%n", ((FLOATING_VALUE_A * FLOATING_VALUE_C) / 2));
            System.out.printf("CIRCULO: %.3f%n", (Math.PI * Math.pow(FLOATING_VALUE_C, 2)));
            System.out.printf("TRAPEZIO: %.3f%n", (((FLOATING_VALUE_A + FLOATING_VALUE_B) * FLOATING_VALUE_C) / 2));
            System.out.printf("QUARADO: %.3f%n", (FLOATING_VALUE_B * FLOATING_VALUE_A));
            System.out.printf("RETANGULO: %.3f%n", (FLOATING_VALUE_A * FLOATING_VALUE_B));

        sc.close();

    }

}
