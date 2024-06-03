package Lab11.Zad07;

import java.util.LinkedList;
import java.util.Scanner;

class listOfEvenStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to count words of even length:");
        String inputString = sc.nextLine();
        String[] words = funkyFunctions.removeWhitespace(inputString);
        LinkedList<String> evenWords = funkyFunctions.findEvenWords(words);
        System.out.println(evenWords);
    }
}
