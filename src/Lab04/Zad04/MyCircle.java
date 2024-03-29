package Lab04.Zad04;

public class MyCircle {
    double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double circumferenceOf(MyCircle Circle) {
        return 2 * Math.PI * Circle.radius;
    }

    public double areaOf(MyCircle Circle) {
        return Math.PI * (Math.pow(Circle.radius, 2));
    }

    public double diameterOf(MyCircle Circle) {
        return Circle.radius * 2;
    }
}
