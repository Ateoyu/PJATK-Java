package Lab10.Zad05to06;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Rectangle implements Figure, Comparable<Figure> {
    private double x1, y1, x2, y2;
    private double[] Sides;

    Rectangle() {
        getUserInput();
        this.x2 = this.x1;
        this.y2 = this.y1;
        this.Sides = new double[]{x1, y1, x2, y2};
    }


    @Override
    public double calculateArea() {
        return x1 * y1;
    }

    @Override
    public double calculatePerimeter() {
        double sum = 0;
        for (double side : Sides) {
            sum += side;
        }
        return sum;
    }

    @Override
    public void getUserInput() {
        System.out.println("Enter Rectangle Width and Length: ");
        Scanner in = new Scanner(System.in);
        this.x1 = in.nextDouble();
        this.y1 = in.nextDouble();
    }

    @Override
    public String toString() {
        return "This Rectangle has:";
    }


    @Override
    public int compareTo(@NotNull Figure otherFigure) {
        return Double.compare(this.calculateArea(), otherFigure.calculateArea());
    }
}
