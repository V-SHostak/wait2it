package Boolean;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive number: ");
        System.out.print("A= ");
        int a = sc.nextInt();

        System.out.println("This number is three-digit and odd: " + (a > 99 && a < 1000 && (a % 2 != 0)));

    }
}
