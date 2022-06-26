package ExceptionEvenTwoNumber;

import java.util.Scanner;

public class ExceptionEvenTwoNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        try {
            System.out.print("Enter number1: ");
            number1 = Integer.parseInt(sc.next());
            System.out.print("Enter number2: ");
            number2 = Integer.parseInt(sc.next());

            int sum = number1 + number2;

            System.out.println(number1 + " + " + number2 + " = " + sum);
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number. Number must be integer.");
        }
    }
}
