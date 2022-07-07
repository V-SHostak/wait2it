package Example;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fibonachi(n));
    }

    private static int fibonachi(int n) {
        if (n == 1) {
            return 0;

        } else if (n == 2) {
            return 1;

        } else {
            return fibonachi(n - 2) + fibonachi(n - 1);
        }
    }
}
