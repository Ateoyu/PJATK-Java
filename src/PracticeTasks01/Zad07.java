package PracticeTasks01;

import java.util.Scanner;

public class Zad07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number you want the next 10 multiples of: ");
        int inputNumber = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int sum = i * inputNumber;
            System.out.println(i + " * " + inputNumber + " = " + sum);
        }
    }
}
