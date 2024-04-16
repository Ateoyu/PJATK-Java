package Lab06.Zad03;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 4);
        Point middlePoint = new Point(1, 1);

        Circle circle = new Circle(middlePoint, 5);

        if (circle.isPointInside(point)) {
            System.out.println("This point is within the circle.");
        } else {
            System.out.println("This point is outside the circle.");
        }



    }
}
