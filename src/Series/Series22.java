package Series;

import java.util.Scanner;

public class Series22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = sc.nextInt();
        boolean falling = true;

        for (int i = 2; i <= n; i++) {
            int curr = sc.nextInt();
            if (curr >= prev) {
                System.out.println(i);
                falling = false;
                break;
            }
            prev = curr;
        }
        if (falling) {
            System.out.println(0);
        }

    }
}
