package If;

import java.util.Scanner;

public class if8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println(a + "\n" + b);
        } else if (b>a) {
            System.out.println(b + "\n" + a);
        } else{
            System.out.println("The numbers are equal");
        }

    }
}
