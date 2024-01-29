package arrayObjects;
import java.util.*;
public class Product implements Comparable<Product> {
     double weight;
     double price;
     int id;
     public Product(int id, double weight, double price) {
        this.id = id;
        this.weight = weight;
        this.price = price;
    }
    public double getWeight() {
        return weight;
    }
    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
    public int compareTo(Product otherProduct) {
        if(this.price>otherProduct.price)
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, 2.5, 10.99));
        products.add(new Product(2, 1.8, 5.99));
        products.add(new Product(3, 3.0, 8.49));
        Collections.sort(products);
        for (Product product : products) {
            System.out.println("Product ID: " + product.getId() +
                    ", Weight: " + product.getWeight() +
                    ", Price: " + product.getPrice());
        }
    }
}

