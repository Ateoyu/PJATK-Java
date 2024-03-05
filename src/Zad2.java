import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        System.out.println("Enter value you want to conver to Fahrenheit:");
        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();
        double convertedTemp = (9.0/5.0)*userInput+32;
        System.out.println(convertedTemp);
    }
}
