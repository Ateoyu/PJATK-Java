package Lab02;

import java.util.Scanner;
public class Zad04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phraseToCheck = scanner.nextLine();
        System.out.println("Input Phrase: " + phraseToCheck);
        phraseToCheck = phraseToCheck.toLowerCase();
        char[] phraseToCheckArray = phraseToCheck.toCharArray();

        boolean isPalindrome = true;
        for (int i = 0; i < phraseToCheck.length()/2; i++) {
            if (phraseToCheckArray[i] != phraseToCheckArray[phraseToCheckArray.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Phrase " + phraseToCheck + " is a palindrome.");
        }
        else {
            System.out.println("Phrase " + phraseToCheck + " is not a palindrome. ");
        }
    }
}
