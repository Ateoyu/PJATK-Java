package Lab02;

import java.util.Scanner;
public class Zad02 {

    public static void inverseArray(int[] createdArray){
        for (int i = createdArray.length - 1; i >= 0; i--) {
            System.out.print(createdArray[i] + " ");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter desired array size: ");
        Scanner scanner = new Scanner(System.in);
        int[] createdArray = new int[scanner.nextInt()];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < createdArray.length; i++) {
            createdArray[i] = scanner.nextInt();
        }

        inverseArray(createdArray);

    }
}
