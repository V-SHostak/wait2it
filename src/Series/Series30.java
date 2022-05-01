package Series;

import java.util.Scanner;

public class Series30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount units K: ");
        int k = sc.nextInt();
        System.out.print("Enter amount numbers in each unit N: ");
        int n = sc.nextInt();


        for (int i = 1; i <= k; i++) {
            int sum = 0;
            System.out.print("K " + i + ": ");
            for (int j = 1; j <= n; j++) {
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println("Sum of number K" + i + ": " + sum);
        }
    }
}
