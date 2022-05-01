package Integer;

import java.util.Scanner;

public class Integer4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integers where A>B:");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int amountSegments = a / b;
        System.out.println("The number of integer segments B in the segment A. \nB = " + amountSegments);

    }
}
