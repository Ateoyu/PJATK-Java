package Lab07.Zad06;

import static java.lang.Math.pow;

class Calculator {

    double calculate(double num1) {
        return pow(num1, 2);
    }

    double calculate(double num1, double num2) {
        return num1 * num2;
    }

    double calculate(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}
