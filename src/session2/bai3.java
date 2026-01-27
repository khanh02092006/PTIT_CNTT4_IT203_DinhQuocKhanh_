package session2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập số ngày trễ của sách thứ " + i + ": ");
            int days = sc.nextInt();
            total += days;
        }

        System.out.println("Tổng số tiền phạt là: " + total);
        sc.close();
    }
}
