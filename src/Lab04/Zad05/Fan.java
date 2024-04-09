package Lab04.Zad05;

import java.util.Scanner;

public class Fan {

    public enum FanSpeed {
        SLOW(1),
        MEDIUM(2),
        FAST(3);

        private int speedValue;

        FanSpeed(int speedValue) {
        }
    }

    private FanSpeed speed;
    private boolean on;
    private double radius;
    private String color;

    public void assignSpeed(FanSpeed speed) {
        this.speed = speed;
    }

    Fan() {
        this.speed = FanSpeed.MEDIUM;
        this.on = false;
        this.radius = 5;
        this.color = "Red";
    }

    Fan(FanSpeed speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int speedInput = sc.nextInt();
            if (speedInput > 0 && speedInput < 4) {
                switch (speedInput) {
                    case 1 -> assignSpeed(FanSpeed.SLOW);
                    case 2 -> assignSpeed(FanSpeed.MEDIUM);
                    case 3 -> assignSpeed(FanSpeed.FAST);
                }
                break;
            }
        }
    }
}