package Task14.purchase;

public class Purchase implements Comparable<Purchase>{

    private String namePurchase;
    private int quantity;

    public Purchase(String namePurchase, int quantity) {
        this.namePurchase = namePurchase;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "namePurchase='" + namePurchase + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Purchase p) {
        if (quantity < p.quantity) {
            return 1;
        } else if (quantity > p.quantity) {
            return -1;
        } else {
            return 0;
        }
    }

}
