package Lab05.Zad04;

import java.util.Random;
import java.util.Scanner;

public class Competitor {

    private String name;
    private int minSpeed;
    private int maxSpeed;
    private int distanceRan;

    Competitor(String name, int minSpeed, int maxSpeed) {
        this.name = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
        this.distanceRan = 0;
    }

    Competitor() {
    }

    public Competitor getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your minimum run speed: ");
        minSpeed = scanner.nextInt();
        System.out.print("Enter your maximum run speed: ");
        maxSpeed = scanner.nextInt();
        return new Competitor(name, minSpeed, maxSpeed);
    }

    public void introduceYourself() {
        System.out.println("Hi! I am " + name + " and I run between " + minSpeed + "-" + maxSpeed + "km/h.");
    }

    public String getName() {
        return name;
    }

    public void run() {
        Random random = new Random();
        int generatedRunSpeed = random.nextInt(maxSpeed - minSpeed) + minSpeed;
        distanceRan += generatedRunSpeed;
    }

    public int getDistanceRan() {
        return distanceRan;
    }
}
