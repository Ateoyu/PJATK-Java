package Lab11.Zad06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class sumOfSet {
    public static void main(String[] args) {
        System.out.println("Enter 10 unique numbers:");
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueCharSet = getUniqueIntegers();
        int sum = 0;
        for (Integer num : uniqueCharSet) {
            sum += num;
        }
        System.out.println("Sum of unique integers: " + sum);
    }

    static Set<Integer> getUniqueIntegers() {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueIntSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            String inputNum;
            int numInt;
            boolean isInSet;
            boolean isNumeric;
            do {
                isInSet = false;
                isNumeric = true;
                inputNum = sc.nextLine();
                if (!isNumeric(inputNum)) {
                    System.out.println(inputNum + " is not a number");
                    isNumeric = false;
                } else {
                    numInt = Integer.parseInt(inputNum);
                    if (uniqueIntSet.contains(numInt)) {
                        System.out.println("Sorry, " + inputNum + " is already in use. Please try again.");
                        isInSet = true;
                    } else {
                        uniqueIntSet.add(numInt);
                    }
                }
            } while (!isNumeric || isInSet);
        }
        return uniqueIntSet;
    }

    static boolean isNumeric(String inputNum) {
        try {
            Integer.parseInt(inputNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
