/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

Data atual: 22/11/2021

Autor (a): Alexandre Gonçalo

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String mensagem = "";

            System.out.println("=====================================================");
            System.out.println("                 INTERVALO DE NÚMEROS                ");
            System.out.println("=====================================================");
            System.out.print("Informe um número para saber seu intervalo: ");
                final double number = sc.nextDouble();

                if (number >= 0.00 && number <= 25.00) {
                    mensagem = "Intervalo [0,25]\n";
                } else if (number >= 0.00 && number <= 50.00) {
                    mensagem = "Intervalo (25,50]\n";
                } else if (number >= 0.0 && number <= 100.00) {
                    mensagem = "Intervalo (75,100]\n";
                } else {
                    mensagem = "Fora de intervalo\n";
                }

            System.out.println("=====================================================");
            System.out.println("                     RESULTADO                       ");
            System.out.println("=====================================================");
            System.out.printf("%s", mensagem);

        sc.close();
    }

}
