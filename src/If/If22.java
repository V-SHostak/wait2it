package If;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinate point");
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quarter plane number 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quarter plane number 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quarter plane number 3");
        } else {
            System.out.println("Quarter plane number 4");
        }
    }
}
