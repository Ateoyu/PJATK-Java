package Lab06.Zad03;

class Circle {
    private Point center;
    private int radius;

    Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    boolean isPointInside(Point point) {
        double distance = Math.sqrt(Math.pow(point.getCoordX() - this.center.getCoordX(), 2) + Math.pow(point.getCoordY() - this.center.coordY, 2));
        if (distance > radius) {
            return false;
        } else {
            return true;
        }
    }

}
