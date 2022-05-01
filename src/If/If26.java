package If;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X = ");
        double x = sc.nextInt();
        double f = 0;

        if (x <= 0) {
            f = -x;
        } else if (x > 0 && x < 2) {
            f = x * x;
        } else if (x >= 2) {
            f = 4;
        }
        System.out.println("f(x) = " + f);

    }
}
