package Lab03;

import java.util.Scanner;
public class Zad04 {
    public static void  reverseString(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string you want to reverse: ");
        string = scanner.nextLine();
        char[] charArr = string.toCharArray();

        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(charArr[i]);
        }
    }
    public static void main(String[] args) {
        String emptyString = "";
        reverseString(emptyString);
    }
}
