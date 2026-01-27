package session2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 100;

        System.out.println("=== HỆ THỐNG TÍNH ĐIỂM UY TÍN ===");
        System.out.println("Nhập số ngày trễ (999 để thoát)");

        while (true) {
            System.out.print("Nhập số ngày trễ: ");
            int lateDays = sc.nextInt();

            if (lateDays == 999) break;

            if (lateDays <= 0) {
                point += 5;
            } else {
                point -= lateDays * 2;
            }
        }

        System.out.println("Tổng điểm uy tín: " + point);

        if (point > 120) {
            System.out.println("Độc giả Thân thiết");
        } else if (point >= 80) {
            System.out.println("Độc giả Tiêu chuẩn");
        } else {
            System.out.println("Độc giả cần lưu ý");
        }

        sc.close();
    }
}
