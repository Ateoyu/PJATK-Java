package Lab07.Zad01;

class Animal {
    protected String name;
    protected String colour;

    Animal(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    String makeSound() {
        return "My name is " + name + " and I am " + colour;
    }
}
