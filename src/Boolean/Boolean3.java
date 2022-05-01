package Boolean;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = sc.nextInt();
        System.out.println("Entered number is even: " + (a % 2 == 0));

    }
}
