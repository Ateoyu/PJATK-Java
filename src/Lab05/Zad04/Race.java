package Lab05.Zad04;

public class Race {
    public static void main(String[] args) {
        Competitor competitor1 = new Competitor();
        competitor1 = competitor1.getInfo();

        Competitor competitor2 = new Competitor();
        competitor2 = competitor2.getInfo();

        Competitor competitor3 = new Competitor();
        competitor3 = competitor3.getInfo();

        System.out.println();

        boolean ran50KM = false;
        do {
            competitor1.run();
            if (competitor1.getDistanceRan() > 50) {
                System.out.println(competitor1.getName() + " has ran over 50KM!");
                competitor1.introduceYourself();
                ran50KM = true;
            }
            competitor2.run();
            if (competitor2.getDistanceRan() > 50) {
                System.out.println(competitor3.getName() + " has ran over 50KM!");
                competitor2.introduceYourself();
                ran50KM = true;
            }
            competitor3.run();
            if (competitor3.getDistanceRan() > 50) {
                System.out.println(competitor2.getName() + " has ran over 50KM!");
                competitor1.introduceYourself();
                ran50KM = true;
            }
        } while (!ran50KM);
    }
}


