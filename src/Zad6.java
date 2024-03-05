import java.util.Scanner;

public class Zad6 {

    static int smallestElement(int[] createdArray) {
        int smallest = createdArray[0];
        for (int i = 1; i < createdArray.length; i++) {
            if (smallest > createdArray[i]) {
                smallest = createdArray[i];
            }
        }
        return smallest;
    }

    static int largestElement(int[] createdArray) {
        int largest = createdArray[0];
        for (int i = 1; i < createdArray.length; i++) {
            if (largest < createdArray[i]) {
                largest = createdArray[i];
            }
        }
        return largest;
    }

    static int sumOfArrayElements(int[] createdArray) {
        int sum = 0;
        for (int i : createdArray) {
            sum += i;
        }
        return sum;
    }

    static double averageOfArrayElements(int[] createdArray, int sum) {
        return (double) sum / createdArray.length;
    }

    static void medianOfArrayElements(int[] createdArray) {
        double median = createdArray.length / 2.0;
        if (median % 1 != 0) {
            System.out.print(createdArray[(int) median]);
            }
        else {
            System.out.print(createdArray[(int) median - 1] + " " + createdArray[(int) median]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] createdArray = new int[arraySize];

        System.out.print("Enter first array element: ");
        createdArray[0] = scanner.nextInt();

        System.out.println("Filled array:");
        int evenIncrement = createdArray[0];
        for (int i = 1; i < arraySize; i++) {
            if (evenIncrement % 2 != 0) {
                evenIncrement++;
            }
            else {
                if (i == 1) {
                    evenIncrement += 2;
                }
            }
            createdArray[i] = evenIncrement;
            evenIncrement += 2;
        }

        for (int i:createdArray) {
            System.out.print("[" + i + "]");
        }

        System.out.print("\n\n[Array statistics]:");

        System.out.print("\nMin: ");
        System.out.print(smallestElement(createdArray));

        System.out.print("\nMax: ");
        System.out.print(largestElement(createdArray));

        System.out.print("\nSum: ");
        System.out.print(sumOfArrayElements(createdArray));

        System.out.print("\nAverage: ");
        System.out.print(averageOfArrayElements(createdArray, sumOfArrayElements(createdArray)));

        System.out.print("\nMedian: ");
        medianOfArrayElements(createdArray);
    }
}
