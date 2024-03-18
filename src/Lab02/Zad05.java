package Lab02;

import java.util.Scanner;

public class Zad05 {

    public static void seatBooking(boolean[][] cinemaSeats) {
        Scanner scanner = new Scanner(System.in);

        String choice = "";
        do {
            displayCinemaSeats(cinemaSeats);
            System.out.println("Enter desired seat row and seat:");
            int inputRow = scanner.nextInt() - 1;
            if (inputRow < 0 || inputRow >= 5) {
                System.out.println("Invalid row number. Please pick again.");
                continue;
            }
            int inputSeat = scanner.nextInt() - 1;
            if (inputSeat < 0 || inputSeat >=10) {
                System.out.println("Invalid seat number. Please pick again.");
                continue;
            }
            if (!cinemaSeats[inputRow][inputSeat]) {
                cinemaSeats[inputRow][inputSeat] = true;
            }
            else {
                System.out.println("Seat is already taken. Please pick another one.");
                continue;
            }
            System.out.println("Do you want to make another seat reservation? \nEnter [x] to exit\nEnter anything else to continue.");
            choice = scanner.next();
        }
        while (!choice.equals("x"));
    }

    public static void displayCinemaSeats(boolean[][] cinemaSeats) {
        System.out.println("Display of Cinema Seats     [x]=Taken [O]=Available");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (!cinemaSeats[i][j]) {
                    System.out.print("O ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        boolean[][] cinemaSeats = new boolean[5][10];

        seatBooking(cinemaSeats);
    }
}
