package If;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {

String s1 = "hello";
String s2 = "hello";
        System.out.println(s1==s2);


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
         double sa = 5/2;



        int a = sc.nextInt();

        if (a >= 0) {
            System.out.println("The number +1 : " + (a + 1));
        } else {
            System.out.println("The number: " + a);
        }
        System.out.println(sa);
    }
}