package Lab04.Zad05;

import java.util.Scanner;

public class Zad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Fan speed:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> Fan.FanSpeed.SLOW;
        }
        System.out.println("Enter Fan onState:");
        boolean onState = sc.nextBoolean();
        System.out.println("Enter Fan radius:");
        double radius = sc.nextInt();
        System.out.println("Enter Fan color:");
        String color = sc.next();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(Fan.FanSpeed.MEDIUM, onState, radius, color);
    }
}