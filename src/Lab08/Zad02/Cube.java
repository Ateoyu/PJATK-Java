package Lab08.Zad02;

class Cube extends Figure3D{

    Cube(int edge) {
        super(new int[] {edge, edge, edge, edge, edge, edge, edge, edge, edge, edge, edge, edge});
    }

    @Override
    double area() {
        return 6 * (edgeArray[0] * edgeArray[1]);
    }

    double volume() {
        return edgeArray[0] * edgeArray[1] * edgeArray[2];
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
