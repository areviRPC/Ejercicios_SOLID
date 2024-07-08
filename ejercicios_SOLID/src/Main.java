// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public interface TaxStrategy {
        double getTax();

        public double calculateTax(Country country);
    }

    public class Country {
        private String name;
        private double tax;

        public Country(String name, double tax) {
            this.name = name;
            this.tax = tax;
        }

        public double getTax() {
            return tax;
        }

        public String getName() {
            return name;
        }

    }

    public class UsaTaxStrategy implements TaxStrategy {

        @Override
        public double getTax() {
            return 0.2;
        }

        @Override
        public double calculateTax(Country country) {
            return 0.2;
        }
    }

    public class UkTaxStrategy implements TaxStrategy {

        @Override
        public double getTax() {
            return 0.1;
        }

        @Override
        public double calculateTax(Country country) {
            return 0.1;
        }


    }

    public class TaxCalculator implements Main.TaxStrategy {

        @Override
        public double getTax() {
            return 0;
        }

        @Override
        public double calculateTax(Main.Country country) {
            if (country.getName().equals("USA")) {
                ;
            } else if (country.getName().equals("UK")) {
                ;
            }
            return 0;
        }

        public static void main(String[] args) {
            System.out.println("Hello world!");
        }
    }
}
/*Pistas

1. Crea una interfaz TaxStrategy con un método calculateTax.
2. Implementa esta interfaz en clases concretas para cada país (por ejemplo, USATaxStrategy y UKTaxStrategy).
3. Modifica TaxCalculator para que use la interfaz TaxStrategy.*/
