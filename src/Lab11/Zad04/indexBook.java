package Lab11.Zad04;

import java.util.*;

public class indexBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phrase for indexing: ");
        String input = sc.nextLine();
        String[] inputArr = input.split("");
        System.out.println("Index of each letter:");
        System.out.println(index(inputArr));

    }
    static Map<String, Set<Integer>> index(String[] inpurArr) {
        Map<String, Set<Integer>> mapIndex = new HashMap<>();
        for (int i = 0; i < inpurArr.length; i++) {
            String character = inpurArr[i];
            if (!mapIndex.containsKey(character)) {
                mapIndex.put(character, new HashSet<>(List.of(i)));
            } else {
                mapIndex.get(character).add(i);
            }
        }
        return mapIndex;
    }
}