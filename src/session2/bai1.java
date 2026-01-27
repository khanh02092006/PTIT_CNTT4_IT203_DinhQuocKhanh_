package session2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.print("Nhập số sách đang giữ: ");
        int booksHolding = sc.nextInt();

        if (age >= 18 && booksHolding < 3) {
            System.out.println("Cho phép mượn sách");
        } else if (age < 18) {
            System.out.println("Bạn chưa đủ tuổi");
        } else {
            System.out.println("Bạn đã mượn quá số lượng cho phép");
        }


    }
}
