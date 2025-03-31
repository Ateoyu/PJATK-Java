package Lab12.Zad03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("Ania", "Turowska"));
        personsList.add(new Person("Marcel", "Stankiewicz"));
        personsList.add(new Person("Szymon", "Czarnowski"));

        Collections.sort(personsList);

        for (Person person : personsList) {
            System.out.println(person);
        }
    }
}
