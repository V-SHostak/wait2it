package Boolean;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        System.out.print("B= ");
        int b = sc.nextInt();
        System.out.println("Inequalities are fair: " + (a > 2 & b <= 3));

    }
}

