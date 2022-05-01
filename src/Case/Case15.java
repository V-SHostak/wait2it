package Case;

import java.util.Scanner;

public class Case15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape cards(M) and size (N)");
        System.out.print("M = ");
        int m = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();
        String sizeCard = null;
        String shapeCard = null;

        switch (n){
            case 6:
                sizeCard = "Six";
                break;
            case 7:
                sizeCard = "Seven";
                break;
            case 8:
                sizeCard = "Eight";
                break;
            case 9:
                sizeCard = "Nine";
                break;
            case 10:
                sizeCard = "Ten";
                break;
            case 11:
                sizeCard = "Jack";
                break;
            case 12:
                sizeCard = "Queen";
                break;
            case 13:
                sizeCard = "King";
                break;
            case 14:
                sizeCard = "Ace";
                break;
        }

        switch (m){
            case 1:
                shapeCard = "Clubs";
                break;
            case 2:
                shapeCard = "Diamonds";
                break;
            case 3:
                shapeCard = "Hearts";
                break;
            case 4:
                shapeCard = "Spades";
                break;

        }
        System.out.println(sizeCard + " " + shapeCard );
    }
}
