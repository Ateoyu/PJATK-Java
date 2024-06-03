package Lab08.Zad01;

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Kapibara kapibara = new Kapibara();

        Animal[] animals = {dog, cat, kapibara};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
