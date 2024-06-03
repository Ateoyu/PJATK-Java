package Lab08.Zad04;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter forename:");
            String forename = scanner.nextLine();
            System.out.println("Enter surname:");
            String surname = scanner.nextLine();
            System.out.println("Enter date of birth:");
            String dateOfBirth = scanner.nextLine();

            Person person = new Person(forename, surname, dateOfBirth);
            System.out.println(person);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
