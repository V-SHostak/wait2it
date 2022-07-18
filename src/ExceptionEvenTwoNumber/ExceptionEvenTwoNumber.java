package ExceptionEvenTwoNumber;

import java.util.Scanner;

public class ExceptionEvenTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number one: ");
        double yourNumberOne = sc.nextDouble();
        System.out.print("Enter number two: ");
        double yourNumberTwo = sc.nextDouble();

        NumberCheck numberOne = new NumberCheck();
        NumberCheck numberTwo = new NumberCheck();

        try {
            numberOne.yourSetNumber(yourNumberOne);
            numberTwo.yourSetNumber(yourNumberTwo);
            double sum = yourNumberOne + yourNumberTwo;
            System.out.println(yourNumberOne + " + " + yourNumberTwo + " = " + sum);
        } catch (NumberException er) {
            System.out.println(er);
        }
    }
}
