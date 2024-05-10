package Lab07.Zad02;

import java.util.Arrays;

class Bookshop extends Shop {

    private final String[] products = {"book1","book2","book3","book4"};

    Bookshop(String address, int size) {
        super(address, size);
    }

    @Override
    String getInformation() {
        return super.getInformation() + " " + Arrays.toString(products);
    }
}
