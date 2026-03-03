package miniproject16;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        FoodProduct repo = new FoodProduct();


        repo.add(new ElectronicProduct("E01", "Laptop", 20000000, 24));
        repo.add(new ElectronicProduct("E02", "Chuột", 500000, 6));
        repo.add(new FoodProduct("F01", "Sữa", 30000, 10));
        repo.add(new FoodProduct("F02", "Bánh", 20000, 5));


        System.out.println("=== DANH SÁCH SẢN PHẨM ===");
        for (Product p : repo.findAll()) {
            if (p != null) {
                p.displayInfo();
                System.out.println("Thành tiền: " + p.calculateFinalPrice());
                System.out.println("------------------");
            }
        }


        System.out.println("=== TÌM SẢN PHẨM E01 ===");
        Product found = repo.findById("E01");
        if (found != null) {
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy!");
        }

        System.out.println("=== SẮP XẾP THEO GIÁ TĂNG DẦN ===");
        List<Product> sortedList = new ArrayList<>(repo.findAll());

        Collections.sort(sortedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - Giá: " + p.getPrice());
        }

        System.out.println("=== THỐNG KÊ ===");
        Map<String, Integer> stats = new HashMap<>();

        for (Product p : repo.findAll()) {
            if (p instanceof ElectronicProduct) {
                stats.put("Electronic", stats.getOrDefault("Electronic", 0) + 1);
            }
        }

        System.out.println(stats);
    }
}
