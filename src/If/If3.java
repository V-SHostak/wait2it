package If;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("The number: " + (a+1));
        } else if (a<0){
            System.out.println("The number: " + (a-2));
        } else {
            System.out.println("The number: " + 10);
        }
    }
}
