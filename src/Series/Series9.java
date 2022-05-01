package Series;

import java.util.Scanner;

public class Series9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount numbers n: ");
        int n = sc.nextInt();
        int k = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 2 != 0) {
                System.out.print(a + "; ");
                k++;
            }
        }
        System.out.println("\nK: " + k);
    }
}
