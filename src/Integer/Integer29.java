package Integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer numbers: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        System.out.print("C= ");
        int c = sc.nextInt();

        int n = (a * b) / (c * c);
        int s = (a * b) % (c * c);
        System.out.println("Amount of squares: " + n);
        System.out.print("Rest ares: " + s);


    }
}
