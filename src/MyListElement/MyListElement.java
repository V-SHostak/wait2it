package MyListElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyListElement {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(33);
        numbers.add(55);
        numbers.add(42);
        numbers.add(32);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()) {
            int x = listIterator.next() * 5;
            System.out.println(x);
        }


        System.out.println("---------------------------------------------");

        Iterator<Integer> listIterator2 = numbers.iterator();
        while (listIterator2.hasNext()) {
            System.out.println(listIterator2.next());
        }

        System.out.println("---------------------------------------------");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
