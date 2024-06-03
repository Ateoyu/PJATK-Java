package Lab08.Zad02;

class Square extends Figure2D {

    public Square(int edge) {
        super(new int[]{edge, edge, edge, edge});
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

