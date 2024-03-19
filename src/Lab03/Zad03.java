package Lab03;

import java.util.Scanner;

public class Zad03 {
    public static int compare(int num1, int num2) {
        int answer = 0;
        if (num2 > num1) {
            answer = num2 - num1;
            System.out.println("2 is bigger because " + num2 + "-" + num1 + "=" + answer);
            return 1;
        } else if (num1 == num2) {
            System.out.println("they are the same because " + num2 + "-" + num1 + "=" + answer);
            return 0;
        } else {
            answer = num1 - num2;
            System.out.println("1 is bigger because " + num1 + "-" + num2 + "=" + answer);
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers you want to compare:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(compare(num1, num2));
    }
}
