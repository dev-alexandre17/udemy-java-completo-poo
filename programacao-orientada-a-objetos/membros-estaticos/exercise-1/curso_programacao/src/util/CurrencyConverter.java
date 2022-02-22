package util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double moneyConverter(double dollarValue, double buyDollar) {
        double dollar = (dollarValue * buyDollar);
        double tax = (dollar + (dollar * IOF));
        return tax;
    }

}
