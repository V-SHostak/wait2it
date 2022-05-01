package Boolean;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates cells");
        System.out.print("X1 = ");
        int x1 = sc.nextInt();
        System.out.print("Y1 = ");
        int y1 = sc.nextInt();
        System.out.print("X2 = ");
        int x2 = sc.nextInt();
        System.out.print("Y2 = ");
        int y2 = sc.nextInt();

        int cell1 = (x1+y1)%2;
        int cell2 = (x2+y2)%2;

        System.out.println("Cells are same: " + (cell1==cell2));
    }
}
