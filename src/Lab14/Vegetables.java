package Lab14;

class Vegetables extends Produce {
    Vegetables(String type, double price, int quantity) {
        super(type, price, quantity, TaxRate.VEGETABLE);
    }
}
