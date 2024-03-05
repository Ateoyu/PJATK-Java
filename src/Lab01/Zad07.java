package Lab01;

import java.util.Scanner;

public class Zad07 {
    public static void main(String[] args) {
        int inputNumber1, inputNumber2;
        System.out.print("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        inputNumber1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        inputNumber2 = scanner.nextInt();

        while (inputNumber1 * inputNumber2 != 0) {
            if (inputNumber1 >= inputNumber2) {
                inputNumber1 %= inputNumber2;
            }
            else {
                inputNumber2 %= inputNumber1;
            }
        }
        int GCD = inputNumber1 + inputNumber2;
        System.out.print("GCD = " + GCD);
    }
}