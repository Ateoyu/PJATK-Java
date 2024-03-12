package PracticeTasks01;

import java.util.Scanner;

public class Zad04 {

    public static void converter(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = (seconds % 60) % 60;

        System.out.println("HH:MM:SS = " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        System.out.println("Enter seconds you want to convert to Hours, Minutes and Seconds:");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        converter(seconds);
    }
}
