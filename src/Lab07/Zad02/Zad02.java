package Lab07.Zad02;

public class Zad02 {
    public static void main(String[] args) {

        Bookshop bookshop = new Bookshop("bingBong", 20);
        System.out.println(bookshop.getInformation());

        Bakery bakery = new Bakery("wahoo", 128);
        System.out.println(bakery.getInformation());
    }
}
