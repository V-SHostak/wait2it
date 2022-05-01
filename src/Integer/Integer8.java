package Integer;

import java.util.Scanner;

public class Integer8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int a = sc.nextInt();
        int b = a / 10;
        int c = a % 10;
        System.out.println("Number: " + c + b);

    }
}
