package Lab10.Zad07;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

class Student implements Comparable<Student> {
    private String forename;
    private String surname;
    private String index;

    Student () {
        getUserInput();
    }

    @Override
    public int compareTo(@NotNull Student otherStudent) {
        return this.index.compareTo(otherStudent.index);
    }

    private void getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student forename: ");
        this.forename = sc.nextLine();
        System.out.print("Enter student surname: ");
        this.surname = sc.nextLine();
        System.out.print("Enter student index: ");
        this.index = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", index='" + index + '\'' +
                '}';
    }
}
