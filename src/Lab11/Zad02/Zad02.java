package Lab11.Zad02;

import java.util.*;

class Zad02 {
    public static void main(String[] args) {
        Random rand = new Random();
        Set<Integer> randSet = new LinkedHashSet<>();
        for (int i = 0; i < 6; i++) {
            randSet.add(rand.nextInt(50));
        }
        System.out.println(randSet);

        System.out.println("Enter your 6 lottery lucky numbers:");
        Scanner sc = new Scanner(System.in);
        Set<Integer> luckyNumbers = new LinkedHashSet<>();
        for (int i = 0; i < 6; i++) {
            String luckyNumber;
            int luckyNumberInt = 0;
            do {
                luckyNumber = sc.nextLine();
                if (!validation.isNumeric(luckyNumber)) {
                    System.out.println(luckyNumber + " is not a number");
                } else {
                    luckyNumberInt = Integer.parseInt(luckyNumber);
                    if (luckyNumberInt < 1) {
                        System.out.println("Sorry, input number is too small, please input a number greater than 0");
                    } else if (luckyNumberInt > 49) {
                        System.out.println("Sorry, input number is too big, please input a number less than 50");
                    } else {
                        luckyNumbers.add(luckyNumberInt);
                    }
                }
            } while (luckyNumberInt < 1 || luckyNumberInt > 49 || !validation.isNumeric(luckyNumber));
        }
        System.out.println("Input Lucky Numbers: " + luckyNumbers);
        Set<Integer> guessedNumbers = validation.guessedNumbers(randSet, luckyNumbers);
        System.out.println("Guessed Lucky Numbers: " + guessedNumbers);
        System.out.println("Number of guessed Numbers: " + guessedNumbers.size());
    }
}


