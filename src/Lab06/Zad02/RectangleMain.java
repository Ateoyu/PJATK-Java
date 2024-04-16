package Lab06.Zad02;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 4);
        System.out.println("Perimeter of rectangle1: " + rectangle1.perimeter());
        System.out.println("Area of rectangle1: " + rectangle1.area());

        Rectangle rectangle2 = new Rectangle(5);
        System.out.println("Perimeter of rectangle2: " + rectangle2.perimeter());
        System.out.println("Area of rectangle2: " + rectangle2.area());
    }
}
