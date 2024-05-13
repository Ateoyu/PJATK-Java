package Lab08.Zad01;

class Zad01 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        String[] inputValues = calc.getUserInput();
        double calcAnswer = calc.calculate(inputValues);

        System.out.println(calc.getOriginalUserInput() + " = " + calcAnswer);
    }
}
