import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Enter array size:");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] createdArray = new int[arraySize];

        System.out.println("Enter first array element:");
        createdArray[0] = scanner.nextInt();

        for (int i = 1; i < arraySize; i++) {
            if (i % 2 == 0) {
                createdArray[i] = i;
            }
        }
        for (int i:createdArray) {
            System.out.println(i);
        }
    }
}
