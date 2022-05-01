package For;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers A<B");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        int n = (b - a) - 1;
        int c = 0;
        for (int i = b - 1; i > a; i--) {
            c = i - 1;
            System.out.print(c + "; ");
        }
        System.out.println("\nRepeat n = " + n);
    }
}
