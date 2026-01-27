package session2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        String[] days = {
                "Thứ 2", "Thứ 3", "Thứ 4",
                "Thứ 5", "Thứ 6", "Thứ 7", "Chủ nhật"
        };

        for (String day : days) {
            System.out.print("Nhập số lượt mượn của " + day + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) continue;

            max = Math.max(max, borrow);
            min = Math.min(min, borrow);
            sum += borrow;
            count++;
        }

        if (count == 0) {
            System.out.println("Không có ngày nào mở cửa");
        } else {
            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.printf("Trung bình: %.2f\n", (double) sum / count);
        }

        sc.close();
    }
}
