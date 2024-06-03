package Lab08.Zad03;

import java.util.Scanner;

class StringUtils {
    Scanner scanner = new Scanner(System.in);

    String inputString;

    StringUtils() {
        this.inputString = getInputString();
    }


    String getInputString() {
        System.out.println("Enter input string: ");
        inputString = scanner.nextLine();
        return inputString;
    }

    int stringOperation() {
        System.out.println("""
                Enter desired string operation:
                To lowercase: 1
                To Uppercase: 2
                Invert: 3
                Cezar Encrypt: 4""");
        return scanner.nextInt();
    }

    String toLowerCase() {
        return inputString.toLowerCase();
    }

    String toUpperCase() {
        return inputString.toUpperCase();
    }

    String invert() {
        StringBuilder invertedString = new StringBuilder();
        invertedString.append(inputString);
        invertedString.reverse();
        return invertedString.toString();
    }

    String encrypt(int offset) {
        StringBuilder result = new StringBuilder();
        for (char character : inputString.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + offset) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    boolean isSameAsOriginal(String originalString) {
        return originalString.equals(inputString);
    }


}
