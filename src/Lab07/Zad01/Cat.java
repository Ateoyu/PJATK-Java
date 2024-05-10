package Lab07.Zad01;

class Cat extends Animal{

    Cat(String name, String colour) {
        super(name, colour);
    }

    String makeSound() {
        return super.makeSound() + ". MEOW!";
    }
}
