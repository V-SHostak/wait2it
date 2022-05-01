package Integer;

import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int b = a / 100;
        System.out.println("Number: " + b);
    }
}
