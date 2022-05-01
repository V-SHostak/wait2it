package If;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        System.out.print("C = ");
        int c = sc.nextInt();

        int plus=0;
        int minus=0;

        if (a>=0){
            plus +=1;
        } else {
            minus +=1;
        }
        if (b>=0){
            plus +=1;
        } else {
            minus +=1;
        }
        if (c>=0){
            plus +=1;
        } else {
            minus +=1;
        }
        System.out.println("Positive numbers = " + plus + "\n Negative numbers = " + minus);

    }
}
