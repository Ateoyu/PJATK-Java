package PracticeTasks01;

public class Zad01 {
    public static void main(String[] args) {
        int oddNumbers = 1;
        System.out.println("Odd numbers less than 100:");
        while (oddNumbers < 100) {
            System.out.print(oddNumbers + " ");
            oddNumbers += 2;
        }
    }
}
