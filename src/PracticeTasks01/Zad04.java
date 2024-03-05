package PracticeTasks01;

import java.util.Scanner;

public class Zad04 {

    public static void converter(double seconds) {
        double hours = seconds / 3600;
        double minutes = (hours % 60) * 60;
        seconds = (minutes % 60) * 60;

        System.out.println("HH:MM:SS = " + hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        System.out.println("Enter seconds you want to convert to Hours, Minutes and Seconds:");
        Scanner scanner = new Scanner(System.in);
        double seconds = scanner.nextInt();
        
        converter(seconds);
    }
}
