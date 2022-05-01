package Series;

import java.util.Scanner;

public class Series11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number K: ");
        int k = sc.nextInt();
        boolean t;
        System.out.print("Enter " + k + " numbers: ");
        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            if (n < k) {
                t = true;
            } else {
                t = false;
            }
            System.out.print(t + "; ");
        }

    }

}
