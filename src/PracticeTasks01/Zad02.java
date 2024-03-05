package PracticeTasks01;

import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) {
        System.out.println("Enter value you want to check if it's even or odd:");
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        if (userInput % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
