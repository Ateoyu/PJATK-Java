package Lab06.Zad04;

enum TicketType {
    NORMAL(1.0),
    DISCOUNTED(0.5);

    private final double reductionPercent;

    TicketType(double reductionPercent) {
        this.reductionPercent = reductionPercent;
    }

    double getReductionPercent() {
        return reductionPercent;
    }
}
