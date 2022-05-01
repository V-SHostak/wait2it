package Integer;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer number more than 999: ");
        int a = sc.nextInt();
        int b = a / 100 % 10;
        System.out.println("Number: " + b);
    }
}
