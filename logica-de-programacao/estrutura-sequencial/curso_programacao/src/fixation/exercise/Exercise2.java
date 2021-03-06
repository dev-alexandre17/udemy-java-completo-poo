/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
deste círculo com quatro casas decimais conforme exemplos.

Fórmula da área: area = π . raio 2

Considere o valor de π = 3.14159

Autor (a): Alexandre Gonçalo

Data atual: 11/11/2021

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

            System.out.println("====================================");
            System.out.println("          ARÉA DE UM CÍRCULO        ");
            System.out.println("====================================");
            System.out.print("Insera o valor do raio: ");
                final double RAY = sc.nextDouble();
            System.out.println("====================================");
            System.out.println("             RESULTADO              ");
            System.out.println("====================================");
            System.out.printf("A=%.4f%n", (PI * Math.pow(RAY, 2)));

            sc.close();

    }

}
