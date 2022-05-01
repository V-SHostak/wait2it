package For;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("K = ");
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(k);
        }

    }
}
