package Flowers;

public class FlowerMain {
    public static void main(String[] args) {

        Rose rose = new Rose("Yellow", 10.5, 3);
        Daisy daisy = new Daisy("White", 5.5, 5);
        Bluet bluet = new Bluet("Blue", 3.5, 11);

        Bouquet bouquet = new Bouquet();
        bouquet.setBouquet(rose);
        bouquet.setBouquet(daisy);
        bouquet.setBouquet(bluet);

        double priceBouquet = bouquet.getBouquetCost();

        System.out.println("Price of bouquet: " + priceBouquet);

    }
}

