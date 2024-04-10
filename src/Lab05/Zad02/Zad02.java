package Lab05.Zad02;

public class Zad02 {
    public static void main(String[] args) {
        Colour[] colours = Colour.values();
        Figure[] figures = Figure.values();



        for(Colour i : colours) {
            for (Figure j : figures) {
                Card card = new Card(i, j);
                System.out.println(card);
            }
        }
    }
}
