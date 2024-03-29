package Lab04.Zad01;

import java.util.Arrays;
import java.util.Scanner;
public class Zad01 {

    public static void arrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array1 size:");
        int inputArray1Size = scanner.nextInt();
        int[] array1 = new int[inputArray1Size];
        System.out.println("Enter array2 size:");
        int inputArray2Size = scanner.nextInt();
        int[] array2 = new int[inputArray2Size];
        arrayFill(array1, array2);
    }
    public static void  arrayFill(int[] array1, int[] array2) {
        System.out.println("Enter the values for array1 elements:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the values for array2 elements:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.println("Created array1:");
        for (int i: array1) {
            System.out.print(i + " ");
        }
        System.out.println("\nCreated array2:");
        for (int i: array2) {
            System.out.print(i + " ");
        }
        System.out.println("\nSum of arrays is: " + Arrays.toString(sumOfArrays(array1, array2)));
    }

    public static int[] sumOfArrays(int[] array1, int[] array2) {
        int[] sumArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            sumArray[i] = array1[i] + array2[i];
        }
        return sumArray;
    }
    public static void main(String[] args) {
        arrayInput();
    }
}
