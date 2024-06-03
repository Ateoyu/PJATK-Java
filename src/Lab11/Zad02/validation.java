package Lab11.Zad02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class validation {
    static boolean isNumeric(String inputNum) {
        try {
            Integer.parseInt(inputNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static Set<Integer> guessedNumbers(Set<Integer> randSet, Set<Integer> inputSet) {
        List<Integer> randList = new ArrayList<>(randSet);
        List<Integer> inputList = new ArrayList<>(inputSet);
        Set<Integer> guessedNumbers = new HashSet<>();

        for (int i = 0; i < randList.size(); i++) {
            for (int j = 0; j < inputList.size(); j++) {
                if (randList.get(i).equals(inputList.get(j))) {
                    guessedNumbers.add(randList.get(j));
                }
            }
        }
        return guessedNumbers;
    }
}
