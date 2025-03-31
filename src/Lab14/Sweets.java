package Lab14;

class Sweets extends Produce {
    Sweets(String type, double price, int quantity) {
        super(type, price, quantity, TaxRate.SWEETS);
    }
}