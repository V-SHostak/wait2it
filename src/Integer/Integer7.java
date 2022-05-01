package Integer;

import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two digit number: ");
        int a = sc.nextInt();
        int amountTen = a / 10;
        int amountUnit = a % 10;
        int sum = amountTen + amountUnit;
        int mult = amountTen * amountUnit;
        System.out.println("Sum of digits: " + sum);
        System.out.println("Multiplication of digits: " + mult);
    }

}
