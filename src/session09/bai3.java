package session09;

public class bai3 {
    public static void main(String[] args) {

        Manager manager = new Manager(
                "nguyễn văn a",
                15000000,
                "công nghệ thông tin"
        );

        System.out.println("=== thông tin quản lý ===");
        manager.display();
    }
}

