/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

Data atual: 22/11/2021

Autor (a): Alexandre Gonçalo

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double orderPrice = 0;

            System.out.println("==============================================");
            System.out.println("CODIGO         ESPECIFICAÇÃO         PREÇO    ");
            System.out.println("==============================================");
            System.out.println("  1            Cachorro Quente       R$ 4.00  ");
            System.out.println("  2            X-Salada              R$ 4.50  ");
            System.out.println("  3            X-Bacon               R$ 5.00  ");
            System.out.println("  4            Torrada simples       R$ 2.00  ");
            System.out.println("  5            Refrigerante          R$ 1.50  ");
            System.out.println("==============================================");
            System.out.print("Código do item: ");
                final int FOOD_ID = sc.nextInt();
            System.out.print("Quantidade: ");
                final int QUANT_FOOD = sc.nextInt();

                switch (FOOD_ID) {
                    case 1:
                        orderPrice = (4.00 * QUANT_FOOD);
                        break;
                    case 2:
                        orderPrice = (4.50 * QUANT_FOOD);
                        break;
                    case 3:
                        orderPrice = (5.00 * QUANT_FOOD);
                        break;
                    case 4:
                        orderPrice = (2.00 * QUANT_FOOD);
                        break;
                    case 5:
                        orderPrice = (1.50 * QUANT_FOOD);
                        break;
                }

            System.out.println("==============================================");
            System.out.println("                 RESULTADO                    ");
            System.out.println("==============================================");
            System.out.printf("Total: R$ %.2f%n", orderPrice);

        sc.close();

    }

}