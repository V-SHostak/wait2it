package For;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        double a = sc.nextDouble();
        System.out.print("Enter integer number N: ");
        int n = sc.nextInt();
        double mult = 1;

        for (int i=1; i<=n; i++){
            mult *= a;
        }
        System.out.println(mult);
    }
}
