package If;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordinate point");
        System.out.print("X = ");
        int x = sc.nextInt();
        System.out.print("Y = ");
        int y = sc.nextInt();

        if ( x==0 && y==0) {
            System.out.println(0);
        } else if ( y==0 && x!=0){
            System.out.println(1);
        } else if ( x==0 && y!=0){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

    }
}
