/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Autor (a): Alexandre Gonçalo

Data atual: 10/01/2022

*/

package fixation.exercise;

import java.util.Scanner;

public class Exercise0 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            final int USER_PASSWORD = 2002;

                System.out.println("============================");
                System.out.println("     VALIDAÇÃO DE SENHA     ");
                System.out.println("============================");
                System.out.print("Senha: ");
                    int password = sc.nextInt();
                System.out.println("============================");
                    while (password != USER_PASSWORD) {
                        System.out.println("Senha Invalida");
                        password = sc.nextInt();
                     }
                System.out.println("============================");
                System.out.println("          RESULTADO         ");
                System.out.println("============================");
                System.out.println("       Acesso Permitido     ");
                System.out.println("============================");

        sc.close();

    }

}
