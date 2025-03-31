package Lab14;

class Main {
    public static void main(String[] args) {
        Fruit[] fruitsArray = Fruit.createRandFruit();
        for (Fruit fruit : fruitsArray) {
            System.out.println(fruit);
        }

    }
}
