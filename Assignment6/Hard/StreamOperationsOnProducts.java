import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{name='" + name + "', category='" + category + "', price=" + price + "}";
    }
}

public class ProductProcessor {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 1200),
            new Product("Smartphone", "Electronics", 800),
            new Product("Banana", "Groceries", 1.5),
            new Product("Milk", "Groceries", 2.0),
            new Product("TV", "Electronics", 1500),
            new Product("Bread", "Groceries", 1.2)
        );

        // 1. Group by category
        Map<String, List<Product>> groupedByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println("Grouped by Category:");
        groupedByCategory.forEach((category, prods) -> {
            System.out.println(category + ": " + prods);
        });

        // 2. Most expensive product in each category
        Map<String, Optional<Product>> mostExpensive = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));

        System.out.println("\nMost Expensive Product in Each Category:");
        mostExpensive.forEach((category, product) ->
            System.out.println(category + ": " + product.orElse(null))
        );

        // 3. Average price of all products
        double averagePrice = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);

        System.out.printf("\nAverage Price of All Products: %.2f%n", averagePrice);
    }
}
