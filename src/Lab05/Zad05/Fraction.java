package Lab05.Zad05;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    private final Scanner scanner = new Scanner(System.in);

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction() {

    }

    public Fraction userInputFraction() {
        System.out.print("[Input your fraction]\n" +
                "Enter numerator: ");
        numerator = scanner.nextInt();
        do {
            System.out.print("Enter denominator: ");
            denominator = scanner.nextInt();
            if (denominator == 0) {
                System.out.println("CANNOT DIVIDE BY 0.");
            }
        }
        while (denominator == 0);

        return new Fraction(numerator, denominator);
    }

    public Fraction addition(Fraction summand1, Fraction summand2) {
        do {
            Fraction temp = new Fraction();
            temp.numerator = summand1.numerator * summand2.denominator;
            temp.denominator = summand1.denominator * summand2.denominator;

            summand2.numerator *= summand1.denominator;
            summand2.denominator *= summand1.denominator;

            summand1 = temp;
        } while (summand1.denominator != summand2.denominator);

        return new Fraction(summand1.numerator + summand2.numerator, summand1.denominator);
    }

    public Fraction subtraction(Fraction minuend, Fraction subtrahend) {
        do {
            Fraction temp = new Fraction();
            temp.numerator = minuend.numerator * subtrahend.denominator;
            temp.denominator = minuend.denominator * subtrahend.denominator;

            subtrahend.numerator *= minuend.denominator;
            subtrahend.denominator *= minuend.denominator;

            minuend = temp;
        } while (minuend.denominator != subtrahend.denominator);

        return new Fraction(minuend.numerator - subtrahend.numerator, minuend.denominator);
    }

    public Fraction multiplication(Fraction multiplier, Fraction multiplicand) {
        multiplier.numerator *= multiplicand.numerator;
        multiplier.denominator *= multiplicand.denominator;

        return new Fraction(multiplier.numerator, multiplier.denominator);
    }

    public Fraction division(Fraction dividend, Fraction divisor) {


        return new Fraction();
    }

    public String outputFraction() {
        return numerator + "/" + denominator;
    }

}
