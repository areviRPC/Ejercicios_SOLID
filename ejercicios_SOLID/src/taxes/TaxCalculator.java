package taxes;

public class TaxCalculator {
    public double calculateTax(TaxStrategy taxStrategy) {
        return taxStrategy.calculateTax();
    }
}

