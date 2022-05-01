package Boolean;

import java.util.Scanner;

public class Boolean40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cell coordinates on a chessboard XY1, 1-8: ");
        System.out.print("X1= ");
        int x1 = sc.nextInt();
        System.out.print("Y1= ");
        int y1 = sc.nextInt();
        System.out.print("X2= ");
        int x2 = sc.nextInt();
        System.out.print("Y2= ");
        int y2 = sc.nextInt();

        int c1 = Math.abs(x2 - x1);
        int c2 = Math.abs(y2 - y1);

        System.out.println("Move knight : " + ((c1 == 1 && c2 == 2) || (c1 == 2 && c2 == 1)));
    }
}
