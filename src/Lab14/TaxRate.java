package Lab14;

enum TaxRate {
    FRUIT(0.3),
    VEGETABLE(0.03),
    DAIRY(0.05),
    MEAT(0.05),
    SWEETS(0.08);

    private final double taxRate;

    TaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
