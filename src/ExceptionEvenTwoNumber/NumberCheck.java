package ExceptionEvenTwoNumber;

public class NumberCheck {

    private double number;

    public double getNumber() {
        return number;
    }

    public void yourSetNumber(double number) throws NumberFormatException {
        if (number % 1 == 0) {
            this.number = number;
        } else {
            throw new NumberFormatException();
        }
    }
}
