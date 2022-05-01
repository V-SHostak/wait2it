package For;

import java.util.Scanner;

public class For38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n - i + 1; j++) {
                a = a * i;
            }
            sum = sum + a;
        }
        System.out.printf("%.3f", sum);
    }

}
