package Calculator;

import Calculator.second.MyCalculator;

public class CalculatorMain {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(4, 5);
        System.out.println(myCalculator + " plus " + myCalculator.plus());
        System.out.println(myCalculator + " minus " + myCalculator.minus());
        System.out.println(myCalculator + " multiply " + myCalculator.multiply());
        System.out.println(myCalculator + " divide " + myCalculator.devide());
    }
}
