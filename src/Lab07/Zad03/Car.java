package Lab07.Zad03;

public class Car {
    protected String brand;
    protected String colour;

    Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    String getInfo() {
        return " brand " + brand + " " +
                "colour " + colour;
    }
}
