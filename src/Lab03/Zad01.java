package Lab03;

import java.util.Scanner;

public class Zad01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers you want to diveide:");
        int num1 = scanner.nextInt();
        int divisor = scanner.nextInt();
        if (divisor != 0) {
            int answer = num1 / divisor;
            System.out.println("Answer is: " + answer);
        } else {
            System.out.println("Invalid divisor input, cannot divide by 0.");
        }
    }
}
