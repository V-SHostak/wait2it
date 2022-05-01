package If;
import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();

        int big;
        int mid;

        if (a > b && a < c) {
            System.out.println("Middle number is A = " + a);
        } else if (b > a && b < c) {
            System.out.println("Middle number is B = " + b);
        } else if (a == b && b == c) {
            System.out.println("Middle number is unknown");
        } else {
            System.out.println("Middle number is C = " + c);
        }
    }
}