package MyException;

public class Methods {

    public double result;

    private boolean comparison(double number1, double number2) throws IllegalAccessException {
        if (number1 < 0 && number2 < 0) {
            throw new IllegalArgumentException("Two negative numbers!");
        } else if ((number1 == 0 && number2 != 0) || (number1 != 0 && number2 == 0)) {
            throw new ArithmeticException("One number zero!");
        } else if (number1 == 0 && number2 == 0) {
            throw new IllegalAccessException("Two numbers zero!");
        } else if (number1 > 0 && number2 > 0) {
            throw new MyException("Two numbers positive!");
        } else {
            return true;
        }
    }

    public double addition(double number1, double number2) throws IllegalAccessException {

        if (comparison(number1, number2)) {
            result = number1 + number2;
        }
        return result;
    }

    public double multiplication(double number1, double number2) throws IllegalAccessException {

        if (comparison(number1, number2)) {
            result = number1 * number2;
        }
        return result;
    }

    public double division(double number1, double number2) throws IllegalAccessException {

        if (comparison(number1, number2)) {
            result = number1 / number2;
        }
        return result;
    }

    public double subtraction(double number1, double number2) throws IllegalAccessException {

        if (comparison(number1, number2)) {
            result = number1 - number2;
        }
        return result;
    }
}
