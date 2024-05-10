package Lab07.Zad01;

class Dog extends Animal{

    Dog(String name, String colour) {
        super(name, colour);
    }

    String makeSound() {
        return super.makeSound() + ". WOOF!";
    }
}
