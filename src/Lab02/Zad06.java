package Lab02;

import java.util.Scanner;

public class Zad06 {

    private static double fib(int n) {
        if (n <=1) {
            return n;
        }
        else
            return  fib(n - 1) + fib(n -2);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter a number you want the fib sequence up to: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        System.out.println("Fib sequence: ");
        for (int i = 0; i < n; i++) {
             System.out.print(fib(i) + " ");
        }
    }
}
