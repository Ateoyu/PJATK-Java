package Lab06.Zad04;

public class Main {
    public static void main(String[] args) {
        Calculator ticket1 = new Calculator();
        ticket1.calculateFinalPrice(TicketType.NORMAL, TicketTime.DAILY);

        Calculator ticket2 = new Calculator();
        ticket2.calculateFinalPrice(TicketType.DISCOUNTED, TicketTime.HOURLY);

        Calculator ticket3 = new Calculator();
        ticket3.calculateFinalPrice(TicketType.DISCOUNTED, TicketTime.DAILY);
    }
}
