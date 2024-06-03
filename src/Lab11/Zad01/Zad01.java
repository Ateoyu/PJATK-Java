package Lab11.Zad01;

import java.util.*;

class Zad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Enter 5 integers for list:");
        for (int i = 0; i < 5; i++) {
            integerList.add(sc.nextInt());
        }

        System.out.print("Input List:" + integerList);

        System.out.println("\n\nList with removed duplicates:");
        System.out.println(removeDuplicates(integerList));

        System.out.println("List of duplicates:");
        System.out.println(identityDuplicates(integerList));
    }

    static Set<Integer> removeDuplicates(List<Integer> list) {
        return new HashSet<>(list);
    }

    static Set<Integer> identityDuplicates(List<Integer> list) {
        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    break;
                }
                if (list.get(i).equals(list.get(j))) {
                    duplicates.add(list.get(i));
                }
            }
        }
        return duplicates;
    }
}
