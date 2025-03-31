package Lab14;

abstract class Produce implements produceFunctionality {
    private String type;
    private double price;
    private int quantity;
    private final TaxRate taxRate;

    Produce(String type, double price, int quantity, TaxRate taxRate) {
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.taxRate = taxRate;
        applyTax();
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public TaxRate getTaxRate() {
        return taxRate;
    }

    @Override
    public void applyTax() {
        double taxAmount = price * taxRate.getTaxRate();
        price += taxAmount;
    }
}
