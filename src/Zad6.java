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

    static double medianOfArrayElements(int[] createdArray) {
        double median = createdArray.length / 2.0;
        if (median % 1 == 0) {
            int medianElement = (int) median;
            return createdArray[medianElement];
            }
        else {
            return median;
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
            while (evenIncrement % 2 != 0) {
                evenIncrement++;
            }
            createdArray[i] = evenIncrement;
            evenIncrement++;
        }

        for (int i:createdArray) {
            System.out.print("[" + i + "]");
        }

        System.out.print("\nSmallest element: ");
        System.out.print(smallestElement(createdArray));

        System.out.print("\nLargest element: ");
        System.out.print(largestElement(createdArray));

        System.out.print("\nSum of elements: ");
        System.out.print(sumOfArrayElements(createdArray));

        System.out.print("\nAverage of elements: ");
        System.out.print(averageOfArrayElements(createdArray, sumOfArrayElements(createdArray)));

        System.out.print("\nMedian of elements: ");
        System.out.print(medianOfArrayElements(createdArray));
    }
}
