package Lab03;

import java.util.Scanner;
import java.util.Random;
public class Zad06 {

    public static void fillArray(int[] arrayToFill) {
        Random random = new Random();
        arrayToFill = random.ints(arrayToFill.length, 0, 101).toArray();
        sumAndOutputArray(arrayToFill);
    }
    public static void sumAndOutputArray(int[] arrayToSum) {
        System.out.println("Randomly filled array: ");
        int sumOfArrayElements = 0;
        for(int i: arrayToSum) {
            System.out.print(i + " ");
            sumOfArrayElements += i;
        }
        checkIfMod5is0(sumOfArrayElements);
    }
    public static void  checkIfMod5is0 (int sumToMod) {
        if (sumToMod % 5 == 0) {
            System.out.println("\ntrue");
        } else {
            System.out.println("\nfalse");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int inputArraySize = scanner.nextInt();
        int[] createdArray = new int[inputArraySize];

        fillArray(createdArray);

    }
}
