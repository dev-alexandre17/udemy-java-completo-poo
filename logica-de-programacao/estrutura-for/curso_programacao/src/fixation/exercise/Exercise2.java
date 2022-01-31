/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

Autor (a): Alexandre Gonçalo

Data: 31/01/2022

*/

package fixation.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Byte> examWeights = new ArrayList<>();

        examWeights.add((byte) 2);
        examWeights.add((byte) 3);
        examWeights.add((byte) 5);

            double weightedAverage = 0;
            int sumWeights = 0;

                System.out.println("================================");
                System.out.println("          MÉDIA PONDERADA       ");
                System.out.println("================================");
                System.out.print("Quantidade de exames feitos: ");
                    int N = sc.nextInt();
                System.out.println("================================");

                    for (int i = 0; i < N; i++) {
                        double test = sc.nextDouble();
                        weightedAverage += (test * examWeights.get(i));
                        sumWeights += examWeights.get(i);
                    }

            System.out.println("=====================================");
            System.out.println("              RESULTADO              ");
            System.out.println("=====================================");
            System.out.printf("%.1f%n ", (weightedAverage / sumWeights));

        sc.close();

    }

}
