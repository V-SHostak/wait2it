package Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        System.out.print("A= ");
        int a = sc.nextInt();

        System.out.println("This number is two-digit and even: " + (a > 9 && a < 100 && (a % 2 == 0)));

    }
}
