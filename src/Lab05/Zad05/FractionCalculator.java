package Lab05.Zad05;

public class FractionCalculator {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        fraction1 = fraction1.userInputFraction();

        Fraction fraction2 = new Fraction();
        fraction2 = fraction2.userInputFraction();

        Fraction fractionAdditionResult =  fraction1.addition(fraction1, fraction2);
        Fraction fractionSubtractionResult = fraction1.subtraction(fraction1, fraction2);
        Fraction fractionMultiplicationResult = fraction1.multiplication(fraction1, fraction2);

        System.out.println("Addition Result: " + fractionAdditionResult.outputFraction());
        System.out.println("Subtraction Result: " + fractionSubtractionResult.outputFraction());
        System.out.println("Multiplication Result " + fractionMultiplicationResult.outputFraction());
    }
}
