package task13.product;

public class Product {

    public String name;
    public Integer length;
    public Integer width;
    public Integer weight;

    public Product(String name, Integer length, Integer width, Integer weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", weight=" + weight +
                '}';
    }
}