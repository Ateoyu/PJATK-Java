package Lab04.Zad04;

import java.util.Scanner;

public class Zad04 {

    public static MyCircle inputRadius() {
        System.out.print("Enter radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        return new MyCircle(scanner.nextDouble());
    }
    public static void main(String[] args) {
        MyCircle Circle = inputRadius();

        System.out.println("Area of circle: " + Circle.areaOf(Circle));
        System.out.println("Circumference of circle: " + Circle.circumferenceOf(Circle));
        System.out.println("Diameter of circle: " + Circle.diameterOf(Circle));
    }
}
