package Lab07.Zad03;

class Streetcar extends Car {
    protected final int length;
    protected final int seats;
    protected final int topSpeed;

    Streetcar(String name, String colour, int length, int seats, int topSpeed) {
        super(name, colour);
        this.length = length;
        this.seats = seats;
        this.topSpeed = topSpeed;
    }

    @Override
    String getInfo() {
        return super.getInfo() + " " +
                "length " + length + " " +
                "seats " + seats + " " +
                "top speed: " + topSpeed;
    }
}
