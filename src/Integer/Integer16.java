package Integer;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int lastDigit = a % 10;
        int middleDigit = a / 10 % 10;
        int firstDigit = a / 100;

        int number = firstDigit * 100 + lastDigit * 10 + middleDigit;

        System.out.println("Digits: " + firstDigit + "; " + middleDigit + "; " + lastDigit + "\nNew number: " + number);
    }
}