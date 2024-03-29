package Lab04.Zad03;

public class Point {
    double x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(double x, double y) {
        double diffX = this.x - x;
        double diffY = this.y - y;
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }

    public double distanceFrom(Point point2) {
        return distanceFrom(point2.x, point2.y);
    }
}
