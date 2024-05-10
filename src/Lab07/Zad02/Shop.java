package Lab07.Zad02;

public class Shop {
    protected String address;
    protected int size;

    Shop(String address, int size) {
        this.address = address;
        this.size = size;
    }

    String getInformation() {
        return address + " " + size;
    }
}
