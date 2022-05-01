package Integer;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100;

        System.out.println("New number: " + b + c + d);
    }
}
