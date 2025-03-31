package Lab12.Zad04;

import java.util.*;

class vowelMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text you want to count vowels for: ");
        String text = sc.nextLine();
        text = text.replaceAll("\\W", "");
        text = text.toLowerCase();


        Map<String, Integer> vowels = findVowelsIn(text);

        System.out.println(vowels);
    }

    static Map<String, Integer> findVowelsIn(String text) {
        List<String> splitText = new ArrayList<>(Arrays.asList(text.split("")));
        Set<String> vowelSet = new HashSet<>(Arrays.asList("a", "e", "i", "o", "u", "y"));
        Map<String, Integer> vowelsMap = new HashMap<>();
        for (String character : splitText) {
            if (vowelSet.contains(character)) {
                vowelsMap.put(character, vowelsMap.getOrDefault(character, 0) + 1);
            }
        }
        return vowelsMap;
    }
}
