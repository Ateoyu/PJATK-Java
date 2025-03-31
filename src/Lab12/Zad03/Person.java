package Lab12.Zad03;

import org.jetbrains.annotations.NotNull;

class Person implements Comparable<Person> {
    private String forename;
    private String surname;

    Person(String forename, String surname) {
        this.forename = forename;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(@NotNull Person otherPerson) {
        return otherPerson.surname.compareTo(this.surname);
    }
}
