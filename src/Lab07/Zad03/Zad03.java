package Lab07.Zad03;

public class Zad03 {
    public static void main(String[] args) {
        Streetcar mini = new Streetcar("Mini", "Red", 4, 4, 149);
        Limousine mercedes = new Limousine("Mercedes", "Black", 10, 10, 100);
        Hypercar pagani = new Hypercar("Pagani", "White", 5, 2, 350);
        Car[] carArray = {mini, mercedes, pagani};

        for (Car i : carArray) {
            System.out.println(i.getInfo());
        }
    }
}
