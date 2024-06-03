package Lab11.Zad03;

import java.util.*;

class StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count the number of times each word appears:");
        String inputString = sc.nextLine();
        inputString = inputString.toLowerCase();
        String[] inputStringSplit = removeWhitespace(inputString);

       for (String word : inputStringSplit) {
           System.out.println(word);
       }
       System.out.println("Word Count: " + countWords(inputStringSplit));

    }
    static String[] removeWhitespace(String inputString) {
        return inputString.split("[^\\p{L}0-9'-]+");
    }

    static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> countWords = new HashMap<>();
        for (String word : words) {
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        return countWords;
    }
}
