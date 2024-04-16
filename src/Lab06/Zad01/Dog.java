package Lab06.Zad01;

public class Dog {

    void bark() {
        System.out.println("Bark");
    }

    void bark(int barkAmount) {
        for (int i = 0; i < barkAmount; i++) {
            System.out.println("Bark");
        }
    }
}
