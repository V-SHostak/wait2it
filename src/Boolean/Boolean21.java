package Boolean;

import java.util.Scanner;

public class Boolean21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digital number: ");
        System.out.print("A= ");
        int a = sc.nextInt();
        int b = a/100;
        int c = (a - b*100)/10;
        int d = a%10;

        System.out.println("Unit: " +b + " ; "+ c +" ; " + d  + " \n" + (b < c && c < d));

    }
}
