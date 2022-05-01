package Integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        System.out.println("Last digit = " + b + " Middle digit = " + c);

    }
}
