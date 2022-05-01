package While;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("N = ");
        double n = sc.nextInt();
        System.out.print("K = ");
        double k = sc.nextInt();
        int t = 0;

        while (n >= k) {
            n = n - k;
            t = t + 1;
        }
        System.out.println("Length of remain segment = " + n + "; Number of segments = " + t);

    }
}
