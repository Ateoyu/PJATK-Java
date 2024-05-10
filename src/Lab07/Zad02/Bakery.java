package Lab07.Zad02;

import java.util.Arrays;

public class Bakery extends Shop{

    private final String[] products = {"bread", "croissant", "donut"};

    Bakery(String address, int size) {
        super(address, size);
    }

    @Override
    String getInformation() {
        return super.getInformation() + " " + Arrays.toString(products);
    }
}
