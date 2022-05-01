package Case;

import java.util.Scanner;

public class Case5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arithmetic operation 1-4(N) and numbers A,B");
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("A = ");
        double a = sc.nextInt();
        System.out.print("B = ");
        double b = sc.nextInt();

        double k;

        switch (n){
            case 1:
                k=a+b;
                System.out.println("A + B = " + k);
                break;
            case 2:
                k=a-b;
                System.out.println("A - B = " + k);
                break;
            case 3:
                k=a*b;
                System.out.println("A * B = " + k);
                break;
            case 4:
                k=a/b;
                System.out.println("A / B = " + k);
                break;
            default:
                System.out.println("Error, the number N must be between 1-4");
        }

    }

}
