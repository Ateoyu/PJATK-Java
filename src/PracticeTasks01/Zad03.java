package PracticeTasks01;

import java.util.Scanner;

public class Zad03 {
    public static void main(String[] args) {
        int inputNumber1, inputNumber2, inputNumber3;
        System.out.println("Enter three numbers:");
        Scanner scanner = new Scanner(System.in);
        inputNumber1 = scanner.nextInt();
        inputNumber2 = scanner.nextInt();
        inputNumber3 = scanner.nextInt();

        if (inputNumber1 + inputNumber2 == inputNumber3) {
            System.out.println("Sum of " + inputNumber1 + " and " + inputNumber2 + " is equal to " + inputNumber3);
        } else if (inputNumber1 + inputNumber3 == inputNumber2) {
            System.out.println("Sum of " + inputNumber1 + " and " + inputNumber3 + " is equal to " + inputNumber2);
        } else if (inputNumber2 + inputNumber3 == inputNumber1) {
            System.out.println("Sum of " + inputNumber2 + " and " + inputNumber3 + " is equal to " + inputNumber1);
        } else {
            System.out.println("No sum of any two numbers is equal to the third number");
        }
    }
}
