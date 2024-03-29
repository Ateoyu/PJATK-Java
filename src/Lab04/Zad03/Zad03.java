package Lab04.Zad03;

import java.util.Scanner;

public class Zad03 {
    public static Point createPointCoordinates() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        return new Point(x,y);
    }

    public static void main(String[] args) {
        System.out.print("Enter coordinates for point0 [x,y]: ");
        Point point0 = createPointCoordinates();
        System.out.print("Enter coordinates for point1 [x,y]: ");
        Point point1 = createPointCoordinates();

        System.out.println("Distance between point0 and point [5,5] = " + point0.distanceFrom(5,5));
        System.out.println("Distance between point0 and point1 = " + point0.distanceFrom(point1));
    }
}
