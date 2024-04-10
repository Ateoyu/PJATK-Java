package Lab05.Zad01;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);
    private int minValue;
    private int maxValue;
    private int generatedRandNum;

    public void getRandomRange() {

        System.out.println("Enter min value for random:");
        minValue = scanner.nextInt();
        System.out.println("Enter max value for random:");
        maxValue = scanner.nextInt();
    }

    public int getGeneratedRandNum() {
        Random random = new Random();
        return random.nextInt((maxValue - minValue + 1) + minValue);
    }

    public void gameLogic() {
        generatedRandNum = getGeneratedRandNum();
        int guessNumber = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            int inputGuess = scanner.nextInt();
            guessNumber += 1;
            if (guessNumber <= 5 && inputGuess == generatedRandNum) {
                System.out.println("Congrats, you guessed the correct number!");
                break;
            }
            if (guessNumber > 5) {
                System.out.println("You FAILED, the answer was: " + generatedRandNum);
                break;
            }
            else {
                if (inputGuess > generatedRandNum) {
                    System.out.println("You guessed TOO HIGH! Guess again.");
                }
                else {
                    System.out.println("You guessed TOO LOW! Guess again.");
                }
            }
        }
    }
}
