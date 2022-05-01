package For;

import java.util.Scanner;

public class For7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer numbers (A<B)");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum = i + sum;
            System.out.print(i + "; ");
        }
        System.out.println(" = " + sum);
    }
}
