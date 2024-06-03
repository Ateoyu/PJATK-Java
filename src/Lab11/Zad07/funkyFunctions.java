package Lab11.Zad07;

import java.util.LinkedList;

public class funkyFunctions {
    static String[] removeWhitespace(String inputString) {
        return inputString.split("[^\\p{L}0-9'-]+");
    }

    static LinkedList<String> findEvenWords(String[] words) {
        LinkedList<String> result = new LinkedList<>();
        for (String word : words) {
            if (word.length() % 2 == 0) {
                result.add(word);
            }
        }
        return result;
    }
}
