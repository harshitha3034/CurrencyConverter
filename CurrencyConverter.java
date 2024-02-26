import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the currency you want to convert from (e.g., INR, USD, EUR, GBP): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the currency you want to convert to (e.g., INR, USD, EUR, GBP): ");
        String toCurrency = scanner.next().toUpperCase();

        // Conversion rates
        double inrToUsdRate = 1.0 / 80.0; // 1 USD = 80 INR
        double inrToEurRate = 1.0 / 90.0; // 1 EUR = 90 INR
        double inrToGbpRate = 1.0 / 100.0; // 1 GBP = 100 INR

        double usdToEurRate = 0.88; // 1 USD = 0.88 EUR
        double usdToGbpRate = 0.77; // 1 USD = 0.77 GBP
        double eurToGbpRate = 0.88 / 0.77; // 1 EUR = 0.88 / 0.77 GBP

        double result = 0.0;

        if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            result = amount * inrToUsdRate;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            result = amount * inrToEurRate;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("GBP")) {
            result = amount * inrToGbpRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            result = amount / inrToUsdRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            result = amount / inrToEurRate;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("INR")) {
            result = amount / inrToGbpRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            result = amount * usdToEurRate;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            result = amount * usdToGbpRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            result = amount / usdToEurRate;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("GBP")) {
            result = amount * eurToGbpRate;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            result = amount / usdToGbpRate;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("EUR")) {
            result = amount / eurToGbpRate;
        } else if (fromCurrency.equals(toCurrency)) {
            result = amount;
        } else {
            System.out.println("Invalid currency input!");
            return;
        }

        System.out.println(amount + " " + fromCurrency + " = " + result + " " + toCurrency);
    }
}
