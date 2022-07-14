package Task14.purchase;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PurchaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter of number purchase do You want add: ");

        int numbedrPurchase = sc.nextInt();

        Set<Purchase> purchaseSet = new HashSet<>();


        for (int i = 0; i < numbedrPurchase; i++) {
            System.out.println("Enter name purchase and quantity.");
            purchaseSet.add(new Purchase(sc.next(), sc.nextInt()));
        }

        System.out.println("Unsorted list");
        for (Purchase ss : purchaseSet) {
            System.out.println(ss);
        }

        System.out.println("-----------------------------------------------");
        System.out.println("Tree set");

        Set<Purchase> hashSetToTreeSet = new TreeSet<>(purchaseSet);
        for (Purchase treeSet : hashSetToTreeSet) {
            System.out.println(treeSet);
        }

    }

}
