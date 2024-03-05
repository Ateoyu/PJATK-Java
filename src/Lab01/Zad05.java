package Lab01;

import java.util.Scanner;

public class Zad05 {
    public static void main(String[] args) {
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] createdArray = new int[arraySize];

        System.out.println("Enter values for each position in the array:");
        for (int i = 0; i < arraySize; i++) {
            createdArray[i] = scanner.nextInt();
        }
        System.out.println("Output array:");
        for (int i:createdArray) {
            System.out.println(i);
        }
    }
}
