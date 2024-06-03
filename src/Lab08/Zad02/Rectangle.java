package Lab08.Zad02;

class Rectangle extends Figure2D {

    Rectangle(int length, int width) {
        super(new int[] {length, width, length, width});
    }

    @Override
    double area() {
        return edgeArray[0] * edgeArray[1];
    }

    @Override
    int perimeter() {
        int sum = 0;
        for (int edge : edgeArray) {
            sum += edge;
        }
        return sum;
    }
}
