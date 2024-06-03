package Lab11.Zad05;

import java.util.*;

public class vowelAndNonVowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count vowels:");
        String inputString = sc.nextLine();

        String stringWithoutWhitespace = inputString.replaceAll("\\W", "");
        stringWithoutWhitespace = stringWithoutWhitespace.toLowerCase();
        String[] chars = stringWithoutWhitespace.split("");
        List<String> characters = new ArrayList<>(Arrays.asList(chars));

        int[] vowelsAndNonVowelsCount = countVowels(characters);
        int vowels = vowelsAndNonVowelsCount[0];
        int nonVowels = vowelsAndNonVowelsCount[1];
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of non vowels: " + nonVowels);
    }

    static int[] countVowels(List<String> characters) {
        Set<String> vowels = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        int vowelsCount = 0;
        int nonVowelsCount = 0;
        for (String character : characters) {
            if (vowels.contains(character)) {
                vowelsCount++;
            } else {
                nonVowelsCount++;
            }
        }
        return new int[]{vowelsCount, nonVowelsCount};
    }


}
