package Lab10.Zad04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateFormatting {
    public static void main(String[] args) {
        System.out.println("Enter in the format you want the current date in:");
        Scanner sc = new Scanner(System.in);
        String dateFormat = sc.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(dateFormat);
        System.out.println(dateFormatter.format(LocalDateTime.now()));
    }
}
