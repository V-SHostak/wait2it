package Series;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double sum=0;

        for (int i=1; i<=10; i++){
            double num = sc.nextInt();
            sum += num;
        }
        System.out.println("The sum of ten numbers: " + sum);

    }
}
