package Lab02;

import java.util.Scanner;
public class Zad01 {

    public static double computeAreaOfCircle(int inputRadius) {
        return Math.PI * (Math.pow(inputRadius, 2));
    }

    public static double computeCircumferenceOfCircle(int inputRadius) {
        return 2 * (Math.PI * inputRadius);
    }
    public static void main(String[] args) {
        System.out.println("Enter radius of the circle you want to calculate:");
        Scanner scanner = new Scanner(System.in);
        int inputRadius = scanner.nextInt();

        System.out.println("Area of the circle: " + computeAreaOfCircle(inputRadius));
        System.out.println("Circumference of the circle: " + computeCircumferenceOfCircle(inputRadius));
    }
}
