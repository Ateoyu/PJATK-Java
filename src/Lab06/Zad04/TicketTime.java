package Lab06.Zad04;

enum TicketTime {
    SINGLE(1.0),
    HOURLY(1.5),
    DAILY(4.5);

    private final double timeFactor;

    TicketTime(double timeFactor) {
        this.timeFactor = timeFactor;
    }

    public double getTimeFactor() {
        return timeFactor;
    }
}