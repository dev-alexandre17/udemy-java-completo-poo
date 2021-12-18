/*
Exercício de fixação

Em um novo programa, inicie as seguintes variáveis:

String product1 = "Computer";
String product2 = "Office desk";

int age = 30;
int code = 5290;
char gender = 'F';

double price1 = 2100.0;
double price2 = 650.50;
double measure = 53.234567;

Em seguida, usando os valores das variáveis, produza a seguinte saída
na tela do console:

Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50

Record: 30 years old, code 5290 and gender: F

Measue with eight decimal places: 53,23456700
Rouded (three decimal places): 52,235
US decimal point: 53.255

Autor (a): Alexandre Gonçalo

Data atual: 11/11/2021

*/

package fixation.exercise;

import java.util.Locale;

public class Exercise0 {

    public static void main(String[] args) {

        final String PRODUCT1 = "Computer", PRODUCT2 = "Office desk";

        final int AGE = 30, CODE = 5290;
        final char GENDER = 'F';

        final double PRICE1 = 2100.0, PRICE2 = 650.50, MEASURE = 53.234567;

        System.out.printf("Products: %n");
        System.out.printf("%s, which price is $ %.2f%n", PRODUCT1, PRICE1);
        System.out.printf("%s, which price is $ %.2f%n", PRODUCT2, PRICE2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", AGE, CODE, GENDER);
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f%n", MEASURE);
        System.out.printf("Rouded (three decimal places): %.3f%n", MEASURE);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", MEASURE);

    }

}

