package Lab04.Zad02;

import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter square side length:");
        double sideLength = scanner.nextDouble();
        Square square1 = new Square(sideLength);
        System.out.println("Area of Square:" + square1.calculateArea());
        System.out.println("Perimeter of Square:" + square1.calculatePerimeter());
    }
}
