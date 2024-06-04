package Lab10.Zad07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students to be in the list: ");
        int studentNum = sc.nextInt();
        List<Student> studentsList = new ArrayList<Student>(studentNum);
        for (int i = 0; i < studentNum; i++) {
            studentsList.add(new Student());
        }

        Collections.sort(studentsList);
        System.out.println("Students in the list sorted by index: ");
        for (Student student : studentsList) {
            System.out.println(student);
        }

    }
}
