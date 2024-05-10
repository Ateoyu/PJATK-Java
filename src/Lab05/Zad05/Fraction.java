package Lab05.Zad05;

import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;
    private final Scanner scanner = new Scanner(System.in);

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(Fraction fraction1, Fraction fraction2) {
        //todo one day
    }

    Fraction() {
    }

    Fraction userInputFraction() {
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

    Fraction bringToCommonDenominator(Fraction fraction1, Fraction fraction2) {
        if (fraction1.denominator != fraction2.denominator) {
            Fraction temp = new Fraction();
            Fraction temp2 = new Fraction();
            temp.numerator = fraction1.numerator * fraction2.denominator;
            temp.denominator = fraction1.denominator * fraction2.denominator;

            temp2.numerator = fraction2.numerator * fraction1.denominator;
            temp2.denominator = fraction2.denominator * fraction1.denominator;

            fraction1 = temp;
            fraction2 = temp2;
        }
        return new Fraction(fraction1, fraction2);
    }

    Fraction addition(Fraction summand1, Fraction summand2) {
        if (summand1.denominator != summand2.denominator) {
            Fraction temp = new Fraction();
            Fraction temp2 = new Fraction();
            temp.numerator = summand1.numerator * summand2.denominator;
            temp.denominator = summand1.denominator * summand2.denominator;

            temp2.numerator = summand2.numerator * summand1.denominator;
            temp2.denominator = summand2.denominator * summand1.denominator;

            summand1 = temp;
            summand2 = temp2;
        }

        return new Fraction(summand1.numerator + summand2.numerator, summand1.denominator);
    }

    Fraction subtraction(Fraction minuend, Fraction subtrahend) {
        if (minuend.denominator != subtrahend.denominator) {
            Fraction temp = new Fraction();
            Fraction temp2 = new Fraction();
            temp.numerator = minuend.numerator * subtrahend.denominator;
            temp.denominator = minuend.denominator * subtrahend.denominator;

            temp2.numerator = subtrahend.numerator * minuend.denominator;
            temp2.denominator = subtrahend.denominator * minuend.denominator;

            minuend = temp;
            subtrahend = temp2;
        }

        return new Fraction(minuend.numerator - subtrahend.numerator, minuend.denominator);
    }

    Fraction multiplication(Fraction multiplier, Fraction multiplicand) {
        Fraction temp = new Fraction();
        temp.numerator = multiplier.numerator * multiplicand.numerator;
        temp.denominator = multiplier.denominator * multiplicand.denominator;

        return temp;
    }

    Fraction division(Fraction dividend, Fraction divisor) {
        Fraction temp = new Fraction();
        temp.numerator = dividend.numerator * divisor.denominator;
        temp.denominator = dividend.denominator * divisor.numerator;

        return temp;
    }

    String outputFraction() {
        return numerator + "/" + denominator;
    }

}
