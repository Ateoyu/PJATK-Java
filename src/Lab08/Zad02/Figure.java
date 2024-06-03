package Lab08.Zad02;

abstract class Figure {
    abstract double area();
    abstract int perimeter();
    int[] edgeArray;

    Figure(int[] edgeArray) {
        for (int edge: edgeArray) {
            if (edge <= 0) {
                throw new IllegalArgumentException("Side must be greater than 0");
            }
            this.edgeArray = edgeArray;
        }
    }
}