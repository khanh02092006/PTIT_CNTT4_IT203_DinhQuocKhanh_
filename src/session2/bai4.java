package session2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Nhập ID sách: ");
            id = sc.nextInt();
            if (id <= 0) {
                System.out.println("Mã không hợp lệ, hãy nhập lại!");
            }
        } while (id <= 0);

        System.out.println("Lưu mã sách thành công");
        sc.close();
    }
}
