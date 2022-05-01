package Integer;

import java.util.Scanner;

public class Integer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int lastDigit = a % 10;
        int m = a / 10;
        int n = lastDigit * 100 + m;

        System.out.println("New number: " + n);
    }
}