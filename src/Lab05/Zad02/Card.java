package Lab05.Zad02;

public class Card {
    Colour colour;
    Figure figure;

    Card(Colour colour, Figure figure) {
        this.colour = colour;
        this.figure = figure;
    }

    public String toString() {
        return figure + " of " + colour;
    }
}
