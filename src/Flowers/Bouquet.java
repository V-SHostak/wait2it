package Flowers;

import java.util.ArrayList;

public class Bouquet{

    private ArrayList<Flower> flowers;

    public Bouquet() {
        this.flowers = new ArrayList<>();
    }

    public double getBouquetCost() {
        double sum = 0;
        for (Flower x : flowers) {
            sum = (sum + x.getPrice() * x.getQuantityFlowers());
        }
        return sum;
    }

    public void setBouquet(Flower flower) {
        flowers.add(flower);
    }

}
