/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

Autor (a): Alexandre Gonçalo

Data atual: 12/11/2021

*/

package fixation.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

            System.out.println("================================");
            System.out.println("   SALÁRIO DO FUNCIONÁRIO (A)   ");
            System.out.println("================================");
            System.out.print("ID do funcionário (a): ");
                final int idFun = sc.nextInt();
            System.out.print("Horas trabalhadas no mês: ");
                final int workH = sc.nextInt();
            System.out.print("Valor por hora: ");
                final double valueH = sc.nextDouble();
            System.out.println("================================");
            System.out.println("           RESULTADO            ");
            System.out.println("================================");
            System.out.printf("NUMBER = %d%n", idFun);
            System.out.printf("SALARY = U$ %.2f%n", (valueH * workH));

        sc.close();

    }

}