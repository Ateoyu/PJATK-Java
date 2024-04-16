package Lab06.Zad04;

class Calculator {
    private final double originalPrice;

    Calculator() {
        this.originalPrice = 4.8;
    }

    void calculateFinalPrice(TicketType ticketType, TicketTime ticketTime) {
        double finalPrice = originalPrice * ticketType.getReductionPercent() * ticketTime.getTimeFactor();
        System.out.println("Ticket Price: " + finalPrice + "zł");
    }
}
