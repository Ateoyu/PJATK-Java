package Lab04.Zad05;

public class Fan {
    public enum FanSpeed {
        SLOW(1),
        MEDIUM,
        FAST;
    }
     public final int speed;

    public FanSpeed(int speed) {
        this.speed = speed;
    }
}

