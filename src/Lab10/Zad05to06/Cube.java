package Lab10.Zad05to06;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Cube implements Figure, Comparable<Figure> {
    private double s1;
    private final double[] Sides;

    Cube() {
        getUserInput();
        this.Sides = new double[] {s1, s1, s1, s1, s1, s1, s1, s1, s1, s1, s1, s1};
    }

    @Override
    public double calculateArea() {
        return Sides[0] * Sides[1] * Sides[2];
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
        System.out.println("Enter Cube side length:");
        Scanner sc = new Scanner(System.in);
        this.s1 = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "This Cube has:";
    }

    @Override
    public int compareTo(@NotNull Figure otherFigure) {
        return Double.compare(this.calculateArea(), otherFigure.calculateArea());
    }
}
