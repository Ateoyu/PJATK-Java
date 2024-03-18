package PracticeTasks01;

import java.util.Scanner;
public class Zad06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings you want to join into one:");
        String inputString1 = scanner.nextLine();
        String inputString2 = scanner.nextLine();

        String joinedStrings = inputString1 + inputString2;

        System.out.println(joinedStrings);
    }
}
