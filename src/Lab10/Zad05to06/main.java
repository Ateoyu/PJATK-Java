package Lab10.Zad05to06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<Figure>();
        Rectangle rectangle = new Rectangle();
        figures.add(rectangle);
        Hexagon hexagon = new Hexagon();
        figures.add(hexagon);
        Cube cube = new Cube();
        figures.add(cube);

        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Figure Area: " + figure.calculateArea());
            System.out.println("Figure Perimeter: " + figure.calculatePerimeter() + "\n");
        }

        System.out.println("Sorted Array: ");
        Collections.sort(figures);
        for (Figure figure : figures) {
            System.out.println(figure.toString());
            System.out.println("Figure Area: " + figure.calculateArea());
            System.out.println("Figure Perimeter: " + figure.calculatePerimeter() + "\n");
        }
    }
}
