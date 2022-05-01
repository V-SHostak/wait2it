package For;

import java.util.Scanner;

public class For36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer numbers");
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("K = ");
        int k = sc.nextInt();
        double s = 0;


        for (int i = 1; i <= n; i++) {
            double p = 1;
            for (int j = 1; j <= k; j++)
                p *= i;
            s += p;
            System.out.println("p= " + p);

        }
        System.out.println("Sum = " + s);
    }
}
