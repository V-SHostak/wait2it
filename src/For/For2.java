package For;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers A<B");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        int n = (b - a) + 1;

        for (int i = a; a <= b; a++) {
            System.out.print(a + "; ");
        }
        System.out.println("\nRepeat n = " + n);
    }
}
