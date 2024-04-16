package Lab06.Zad02;

public class Rectangle {
    private int a;
    private int b;

    Rectangle(int width, int length) {
        this.a = width;
        this.b = length;
    }

    Rectangle(int bothSidesLength) {
        this.a = bothSidesLength;
        this.b = bothSidesLength;
    }

    int perimeter() {
        int perimeterResult = (2*a) + (2*b);
        return perimeterResult;
    }

    int area() {
        int areaResult = a * b;
        return areaResult;
    }
}
