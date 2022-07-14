package task13.product;

import java.util.Comparator;

public class WeightComparatorProducts implements Comparator <Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.weight.compareTo(o2.weight);
    }
}
