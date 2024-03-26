package Lab04.Zad03;

import java.util.Scanner;

public class Zad03 {

    public void inputCoordinates() {
        System.out.print("Enter coordinates for point1 [x,y]: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
    }
    public Point createPointCoordinates() {
        inputCoordinates();
        return Point = new Point(x,y);
    }

    public static void main(String[] args) {
        enterPointCoordinates();
        Point point1 = new Point(x, y);
    }
}
