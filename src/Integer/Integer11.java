package Integer;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int a = sc.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100;

        int sum = b + c + d;
        int mult = b * c * d;
        System.out.println("Summa all digits: " + sum + " Multiplication all digits: " + mult);
    }
}
