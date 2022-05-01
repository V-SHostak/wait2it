package Boolean;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        System.out.print("C= ");
        int c = sc.nextInt();
        System.out.println("Numbers are positive: " + (a == (-1 * b) || b == (-1 * c) || (-1 * a) == c));

    }
}
