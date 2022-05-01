package Integer;

import java.util.Scanner;

public class Integer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int number1 = a / 100;
        a = a % 100 * 10;
        a = a + number1;

        System.out.println("New number: " + a);
    }
}
