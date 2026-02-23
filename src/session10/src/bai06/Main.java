package session10.src.bai06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200));
        products.add(new Product("Mouse", 25));
        products.add(new Product("Keyboard", 75));
        products.add(new Product("Monitor", 300));

        // Anonymous Class: sắp xếp theo giá tăng dần
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return Double.compare(a.price, b.price);
            }
            // Dùng Anonymous Class khi cần thêm thuộc tính hoặc logic phức tạp
        });

        System.out.println("Danh sách theo giá:");
        products.forEach(System.out::println);

        // Lambda Expression: sắp xếp theo tên A-Z
        products.sort((a, b) -> a.name.compareTo(b.name));

        System.out.println("\nDanh sách theo tên:");
        products.forEach(System.out::println);
    }
}
