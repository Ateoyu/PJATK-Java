package Lab05.Zad03;

import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of times you want to flip the coin:");
        Coin coin = new Coin();
        coin.getAttempts(scanner.nextInt());
        coin.numOfResults();
        coin.probability();
    }
}
