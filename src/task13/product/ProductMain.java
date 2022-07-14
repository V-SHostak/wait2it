package task13.product;

import java.util.*;

public class ProductMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Car", 333, 212, 1202));
        products.add(new Product("Bicycle", 123, 50, 54));
        products.add(new Product("Table", 432, 342, 55));
        products.add(new Product("Chair", 122, 323, 23));

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add product");
        System.out.println("2. Remove product.");
        System.out.println("3. Replace the product.");
        System.out.println("4. Sort by name.");
        System.out.println("5. Sort by length.");
        System.out.println("6. Sort by width.");
        System.out.println("7. Sort by weight.");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Enter the number (from 1 to 7) of the task you want to solve: ");

        switch (sc.next()) {
            case "1": {
                System.out.println("----------------------------------------------------------------------");
                System.out.print("How many products do you want to add? ");
                int numberOfCommunies = sc.nextInt();
                for (int i = 0; i < numberOfCommunies; i++) {
                    System.out.print("Please enter the name of product: ");
                    String name = sc.next();
                    System.out.print("Please enter the lenght of product: ");
                    Integer length = sc.nextInt();
                    System.out.print("Please enter the width of product: ");
                    Integer width = sc.nextInt();
                    System.out.print("Please enter the weight of product: ");
                    Integer weight = sc.nextInt();
                    System.out.println("------------------------------------");

                    products.add(new Product(name, length, width, weight));

                }
                for (Product comm : products) {
                    System.out.println(comm);
                }
                break;
            }

            case "2": {
                System.out.println("----------------------------------------------------------------------");
                int index = 0;
                for (Product comm : products) {
                    System.out.println(index++ + ": " + comm);
                }
                System.out.println("----------------------------------------------------------------------");
                System.out.print("Enter index of product (list above) which You want to delete: ");
                products.remove(sc.nextInt());
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("New list of products:");
                int index2 = 0;
                for (Product comm : products) {
                    System.out.println(index2++ + ": " + comm);
                }
                break;
            }

            case "3": {
                System.out.println("----------------------------------------------------------------------");
                int index = 0;
                for (Product comm : products) {
                    System.out.println(index++ + ": " + comm);
                }
                System.out.println("----------------------------------------------------------------------");
                System.out.print("Enter index of product (list above) which You want to replace: ");

                int indexProduct = sc.nextInt();
                System.out.print("Please enter the NEW name of product: ");
                String name = sc.next();
                System.out.print("Please enter the lenght of product: ");
                Integer length = sc.nextInt();
                System.out.print("Please enter the width of product: ");
                Integer width = sc.nextInt();
                System.out.print("Please enter the weight of product: ");
                Integer weight = sc.nextInt();
                System.out.println("------------------------------------");

                products.set(indexProduct, new Product(name, length, width, weight));
                int index2 = 0;
                for (Product comm : products) {
                    System.out.println(index2++ + ": " + comm);
                }
                break;
            }

            case "4": {
                System.out.println("----------------------------------------------------------------------");
                NameComperatorProducts nameComperatorProducts = new NameComperatorProducts();
                Collections.sort(products, nameComperatorProducts);
                for (Product comm : products) {
                    System.out.println(comm);
                }
                break;
            }
            case "5": {
                System.out.println("----------------------------------------------------------------------");
                LengthComperatorProducs lengthComperatorProducs = new LengthComperatorProducs();
                Collections.sort(products, lengthComperatorProducs);

                for (Product lengthComp : products) {
                    System.out.println(lengthComp);
                }
                break;
            }

            case "6": {
                System.out.println("----------------------------------------------------------------------");
                WidthComparatorProducs widthComparatorProducs = new WidthComparatorProducs();
                Collections.sort(products, widthComparatorProducs);

                for (Product widthComp : products) {
                    System.out.println(widthComp);
                }
                break;

            }

            case "7": {
                System.out.println("----------------------------------------------------------------------");
                WeightComparatorProducts weightComparatorProducts = new WeightComparatorProducts();
                Collections.sort(products, weightComparatorProducts);

                for (Product weightComp : products) {
                    System.out.println(weightComp);
                }
                break;
            }

        }
    }
}