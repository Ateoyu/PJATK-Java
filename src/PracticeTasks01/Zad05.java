package PracticeTasks01;

import java.util.Random;
import java.util.Scanner;

public class Zad05 {

    public static boolean checkIf10AtTheEnds(int[] createdArray) {
        return createdArray[0] == 10 || createdArray[createdArray.length - 1] == 10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of integer array: ");
        int inputArraySize = scanner.nextInt();
        int[] createdArray = new int[inputArraySize];

        Random random = new Random();

        createdArray = random.ints(createdArray.length, 0, 11).toArray();

        System.out.println("Randomly Filled Array:");
        for (int i:createdArray){
            System.out.print(i + " ");
        }
        if (checkIf10AtTheEnds(createdArray)) {
            System.out.println("\nThe start or end of the array is equal to 10");
        }
        else {
            System.out.println("\nThe array does not start nor end with 10");
        }
    }
}
