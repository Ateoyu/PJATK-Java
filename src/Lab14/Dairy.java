package Lab14;

class Dairy extends Produce {
    Dairy(String type, double price, int quantity) {
        super(type, price, quantity, TaxRate.DAIRY);
    }
}
