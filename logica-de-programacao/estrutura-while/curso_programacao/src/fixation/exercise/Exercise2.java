/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.

Data atual: 26/01/2022

Autor (a): Alexandre Gonçalo

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int alcohol = 0, gasoline = 0, diesel = 0;

        System.out.println("===============================");
        System.out.println("       POSTO DE GASOLINA       ");
        System.out.println("===============================");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
        System.out.println("===============================");
        System.out.print("Opção: ");
        int fuel = sc.nextInt();

        while (fuel != 4) {
            fuel = sc.nextInt();
            switch (fuel) {
                case 1:
                    alcohol +=1;
                    break;
                case 2:
                    gasoline += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.println("===============================");
                    System.out.println("           RESULTADO           ");
                    System.out.println("===============================");
                    System.out.println("MUITO OBRIGADO");
                    break;
                default:
                    System.out.println("Código inválido.");
            }
        }

        sc.close();

        System.out.printf("Alcool: %d%n", alcohol);
        System.out.printf("Gasolina: %d%n", gasoline);
        System.out.printf("Diesel: %d%n", diesel);
        System.out.println("===============================");

    }

}
