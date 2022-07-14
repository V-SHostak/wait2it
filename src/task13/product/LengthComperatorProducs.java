package task13.product;

import java.util.Comparator;

public class LengthComperatorProducs  implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.length.compareTo(o2.length);
    }
}
