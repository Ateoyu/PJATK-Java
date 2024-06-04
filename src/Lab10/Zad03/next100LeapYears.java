package Lab10.Zad03;

import java.time.LocalDate;

public class next100LeapYears {
    public static void main(String[] args) {
        for (LocalDate date = LocalDate.now(), endDate = date.plusYears(100); date.isBefore(endDate) ; date = date.plusYears(1)) {
            if (date.isLeapYear()) {
                System.out.println(date.getYear());
            }
        }
    }
}
