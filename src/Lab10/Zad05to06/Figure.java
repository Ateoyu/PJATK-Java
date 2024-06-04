package Lab10.Zad05to06;

interface Figure extends Comparable<Figure> {
    double calculateArea();
    double calculatePerimeter();
    void getUserInput();
    @Override
    String toString();

}
