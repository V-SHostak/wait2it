package If;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a<b) {
            System.out.println("Sequence number: " + 1);
        } else {
            System.out.println("Sequence number: " + 2);
        }

    }
}
