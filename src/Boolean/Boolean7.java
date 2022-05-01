package Boolean;

import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        System.out.print("C= ");
        int c = sc.nextInt();
        System.out.println("Inequalities are fair: " + ((a < b && b < c) || (c < b && b < a)));

    }
}
