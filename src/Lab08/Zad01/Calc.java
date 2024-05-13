package Lab08.Zad01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Calc {
    private final Scanner scanner = new Scanner(System.in);
    private String userInput;
    private char operation;

    Calc() {
    }

    String[] getUserInput() {
        System.out.println("Enter your desired calculation [ex. 6/2]:");
        userInput = scanner.nextLine();

        try {
            if ((operation = getOperation()) != 'e') {
                String[] userInputArray = userInput.split("[+\\-*/]+");
                if (userInputArray.length > 2) {
                    throw new RuntimeException("Invalid Input, more than 2 numbers input");
                } else if (userInputArray.length < 2) {
                    throw new RuntimeException("Invalid Input, less than 2 numbers input");
                } else {
                    return userInputArray;
                }
            } else {
                throw new RuntimeException("Invalid Input, no valid operation");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getUserInput();
        }
    }

    private char getOperation() {
        Pattern operationPattern = Pattern.compile("[+\\-*/]+");
        Matcher matcher = operationPattern.matcher(userInput);
        if (matcher.find()) {
            operation = matcher.group().charAt(0);
            return operation;
        } else {
            return 'e';
        }
    }

    double calculate(String[] inputValues) {
        try {
            double num1 = Double.parseDouble(inputValues[0]);
            double num2 = Double.parseDouble(inputValues[1]);

            switch (operation) {
                case '+' -> {
                    return num1 + num2;
                }
                case '-' -> {
                    return num1 - num2;
                }
                case '*' -> {
                    return num1 * num2;
                }
                case '/' -> {
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        throw new ArithmeticException("Invalid input, cannot divide by zero");
                    }
                }
                default -> throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    String getOriginalUserInput() {
        return userInput;
    }
}