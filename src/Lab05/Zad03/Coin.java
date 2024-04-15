package Lab05.Zad03;

import java.util.Random;

public class Coin {

    private int heads;
    private int tails;
    private int attempts;

    Coin() {
        this.heads = 0;
        this.tails = 1;
    }

    public void getAttempts(int attempts) {
        this.attempts = attempts;
    }

    private int[] coinFlip(int attempts) {
        Random random = new Random();
        int[] randomArray = new int[attempts - 1];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(2);
        }
        return randomArray;
    }

    public void numOfResults() {
        int[] randomArray = coinFlip(attempts);
        for (int element : randomArray) {
            if (element == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("[AMOUNT ROLLED] \n" +
                "Heads: " + heads + "\n" +
                "Tails: " + tails + "\n");
    }

    public void probability() {
        double headsProbability = (double) (heads * 100) / attempts;
        double tailsProbability = (double) (tails * 100) / attempts;

        System.out.println("[PROBABILITY IN " + attempts + " FLIPS]\n" +
                "Heads Probability: " + headsProbability + "%\n" +
                "Tails Probability: " + tailsProbability + "%");
    }
}
