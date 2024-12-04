//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double amount = 100;
        CurrencyConverter currencyConverter = new CurrencyConverter();
        //Utilisation de mon adaptateur
        CurrencyAdapter currencyAdapter = new CurrencyAdapterConverter(currencyConverter);

        System.out.println("La monnaie de base est de " + amount + " euros, nous allorns le transformer en GBP.");
        amount = currencyAdapter.convertToCurrency("EUR","GBP",amount);
        System.out.println("\n La monnaie est transformée en "+ amount + " GBP.");

        amount = currencyAdapter.convertToCurrency("EUR","USD",amount);
        System.out.println("\n La monnaie est transformée en "+ amount + " USD.");

    }
}