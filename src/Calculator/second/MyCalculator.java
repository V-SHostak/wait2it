package Calculator.second;

import Calculator.first.Numerable;

import java.util.Scanner;

public class MyCalculator implements Numerable {

    private double number1;
    private double number2;

    public MyCalculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public double devide() {
        return number1 / number2;
    }

    @Override
    public double minus() {
        return number1 - number2;
    }

    @Override
    public double multiply() {

        return number1 * number2;
    }

    @Override
    public double plus() {
        return number1 + number2;
    }

    @Override
    public String toString() {
        return "number1 = " + number1 +
                ", number2 = " + number2;
    }
}
