package Lab03;

import java.util.Scanner;
public class Zad05 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for each element in array that will be multiplied by 3: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Array values multiplied by 3:");
        for (int i: array) {
            System.out.print(i * 3 + " ");
        }
    }
}
