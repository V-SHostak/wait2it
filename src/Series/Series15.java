package Series;

import java.util.Scanner;

public class Series15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number K: ");
        int k = sc.nextInt();
        System.out.print("Enter " + k + " numbers: ");

        for (int i = 1; i <= k; i++) {
            int n = sc.nextInt();
            if (n > k) {
                System.out.println(n);
            } if (n==0){
                break;
            } else {
                continue;
            }

        }

    }

}
