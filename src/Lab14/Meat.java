package Lab14;

class Meat extends Produce {
    Meat(String type, double price, int quantity) {
        super(type, price, quantity, TaxRate.MEAT);
    }
}