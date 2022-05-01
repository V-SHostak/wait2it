package Boolean;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sides of the triangle: ");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();

        System.out.println("The triangle is right-angled: " + ((a*a == b * b + c * c) || (b*b == a * a + c * c) || (c*c == b * b + a * a)));

    }
}
