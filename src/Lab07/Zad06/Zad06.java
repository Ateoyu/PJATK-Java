package Lab07.Zad06;

public class Zad06 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(2));
        System.out.println(calculator.calculate(3, 4));
        System.out.println(calculator.calculate(5, 6, 7));
    }
}
