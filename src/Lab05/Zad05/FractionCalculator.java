package Lab05.Zad05;

public class FractionCalculator {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        fraction1 = fraction1.userInputFraction();

        Fraction fraction2 = new Fraction();
        fraction2 = fraction2.userInputFraction();

        Fraction fractionAdditionResult = fraction1.addition(fraction1, fraction2);
        Fraction fractionSubtractionResult = fraction1.subtraction(fraction1, fraction2);
        Fraction fractionMultiplicationResult = fraction1.multiplication(fraction1, fraction2);
        Fraction fractionDivisionResult = fraction1.division(fraction1, fraction2);

        System.out.println("\n[RESULTS]\n" +
                "Addition Result: " + fractionAdditionResult.outputFraction() + "\n" +
                "Subtraction Result: " + fractionSubtractionResult.outputFraction() + "\n" +
                "Multiplication Result: " + fractionMultiplicationResult.outputFraction() + "\n" +
                "Division Result: " + fractionDivisionResult.outputFraction());
    }
}
