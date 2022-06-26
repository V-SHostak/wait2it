package ExceptionEvenNumber;

import java.util.Scanner;

public class ExceptionEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        try {
            number = Integer.parseInt(sc.next());
            if (number % 2 == 0) {
                System.out.println("You enter even number = " + number);
            } else {
                System.out.println("You enter odd number = " + number);
            }
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number. Number must be integer.");
        }
    }
}
