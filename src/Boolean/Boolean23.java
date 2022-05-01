package Boolean;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digital number: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        int e = a / 1000;
        int d = a % 1000 / 100;
        int c = a % 100 / 10;
        int b = a % 10;

        System.out.println("Unit: " + e + " ; " + d + " ; " + c + " ; " + b + " \n" + (e == b && c == d));

    }
}