package If;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();

        if (a != b && b == c) {
            System.out.println("Sequence number: " + 1);
        } else if (b != c && a == c) {
            System.out.println("Sequence number: " + 2);
        } else {
            System.out.println("Sequence number: " + 3);
        }
    }
}
