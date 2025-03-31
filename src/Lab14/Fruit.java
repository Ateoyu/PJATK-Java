package Lab14;

import java.util.Random;

class Fruit extends Produce {
    enum FruitPrice {
        APPLE(1.00),
        BANANA(1.50),
        ORANGE(2.00);

        private final double price;
        FruitPrice(double price) {
            this.price = price;
        }

        private double getPrice() {
            return price;
        }
    }

    Fruit() {
        super("", 0, 0, null);
    }

    Fruit(String type, double price, int quantity) {
        super(type, price, quantity, TaxRate.FRUIT);
    }

    static Fruit[] createRandFruit() {
        Random rand = new Random();
        int numOfFruit = rand.nextInt(100);

        Random randFruitType = new Random();
        int fruitType;

        Fruit[] fruits = new Fruit[numOfFruit];
        for (int i = 0; i < numOfFruit; i++) {
            fruitType = randFruitType.nextInt(3);
            switch (fruitType) {
                case 0 -> {
                    Random numOfFruitType = new Random();
                    int fruitTypeNum = numOfFruitType.nextInt(50);
                    fruits[i] = new Fruit("Apple", FruitPrice.APPLE.getPrice(), fruitTypeNum);
                }
                case 1 -> {
                    Random numOfFruitType = new Random();
                    int fruitTypeNum = numOfFruitType.nextInt(50);
                    fruits[i] = new Fruit("Banana", FruitPrice.BANANA.getPrice(), fruitTypeNum);
                }
                case 2 -> {
                    Random numOfFruitType = new Random();
                    int fruitTypeNum = numOfFruitType.nextInt(50);
                    fruits[i] = new Fruit("Orange", FruitPrice.ORANGE.getPrice(), fruitTypeNum);
                }
            }
        }
        return fruits;
    }


}
