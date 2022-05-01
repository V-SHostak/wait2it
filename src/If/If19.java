package If;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();
        System.out.print("D = ");
        int d = sc.nextInt();

        if (a != b && b == c && c == d) {
            System.out.println("Sequence number: " + 1);
        } else if (b != c && a == c && c == d) {
            System.out.println("Sequence number: " + 2);
        } else if (c != d && a == b && b == d) {
            System.out.println("Sequence number: " + 3);
        } else
            System.out.println("Sequence number: " + 4);
    }
}

