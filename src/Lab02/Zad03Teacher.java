package Lab02;

import java.util.Scanner;

public class Zad03Teacher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time in 24 hour clock to convert to 12 hours [hh:mm]:");
        String time24 = scanner.nextLine();
        String[] time24Split = time24.split(":");
        int hours = Integer.parseInt(time24Split[0]);
        int minutes = Integer.parseInt(time24Split[1]);

        String am_pm = "AM";
        if (hours > 12) {
            am_pm = "PM";
            hours %= 12;
        } else if (hours == 12) {
            am_pm = "PM";
        } else if (hours == 0) {
            hours += 12;
        }

        System.out.println(time24 + " in 12 hours clock is " + hours + ":" + minutes + am_pm);
    }
}
