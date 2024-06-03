package Lab11.Zad08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class countCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string to count unique characters:");
        String input = sc.nextLine();
        String noWhitespaceInput = input.replaceAll("\\s", "");
        String[] inputSplit = noWhitespaceInput.split("");
        Set<String> inputSet = new HashSet<>(Arrays.asList(inputSplit));
        System.out.println(inputSet);
        System.out.println("Number of unique characters: " + inputSet.size());
    }
}
