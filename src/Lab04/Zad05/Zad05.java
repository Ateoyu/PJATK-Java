package Lab04.Zad05;

import java.util.Scanner;

public class Zad05 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Fan speed:");
        int choice = sc.nextInt();
        fan1.setSpeed(choice);

        System.out.println("Enter Fan radius:");
        double radius = sc.nextDouble();
        System.out.println("Enter Fan onState:");
        boolean onState = sc.nextBoolean();
        System.out.println("Enter Fan radius:");
        System.out.println("Enter Fan color:");
        String color = sc.next();
        Fan fan2 = new Fan(null ,onState, radius, color);
    }
}