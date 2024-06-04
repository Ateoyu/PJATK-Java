package Lab10.Zad05to06;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Hexagon implements Figure, Comparable<Figure> {
    private double s1;
    private double[] Sides;

    Hexagon() {
        getUserInput();
        this.Sides = new double[] {s1, s1, s1, s1, s1, s1};
    }


    @Override
    public double calculateArea() {
        return (3*Math.sqrt(3)*Math.pow(s1, 2))/2;
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
        System.out.println("Enter Hexagon side lengths:");
        Scanner sc = new Scanner(System.in);
        this.s1 = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "This Hexagon has:";
    }

    @Override
    public int compareTo(@NotNull Figure otherFigure) {
        return Double.compare(this.calculateArea(), otherFigure.calculateArea());
    }
}
