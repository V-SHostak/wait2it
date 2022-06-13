package Flowers;

public class Flower {

    private String color;
    private double price;
    private int quantityFlowers;

    public Flower(String color, double price, int quantityFlowers) {
        this.color = color;
        this.price = price;
        this.quantityFlowers = quantityFlowers;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityFlowers() {
        return quantityFlowers;
    }
}
