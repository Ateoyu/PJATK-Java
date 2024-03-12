package Lab02;

import java.util.Scanner;
public class Zad03 {
    public static void main(String[] args) {
        System.out.println("Enter time in 24 Hour format [hh:mm]:");
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int hour12 = 0;
        if (hour > 12) {
            hour12 = hour % 12;
            System.out.println(hour + ":" + minute + " in 12 hour clock is " + hour12 + ":" + minute + "PM");
        }
        else {
            hour12 = hour;
            System.out.println(hour + ":" + minute + " in 12 hour clock is " + hour12 + ":" + minute + "AM");
        }
    }
}
