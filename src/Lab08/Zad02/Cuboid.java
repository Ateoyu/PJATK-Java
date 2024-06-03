package Lab08.Zad02;

class Cuboid extends Figure3D {

    Cuboid(int length, int width) {
        super(new int[]{width, width, width, width, length, length, length, length, width, width, width, width});
    }

    @Override
    double area() {
        return 2 * (edgeArray[0] * edgeArray[1]) + 4 * (edgeArray[0] * edgeArray[4]);
    }

    @Override
    double volume() {
        return edgeArray[0] * edgeArray[1] * edgeArray[4];
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
