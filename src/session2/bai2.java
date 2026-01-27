package session2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thể loại sách (A, B, C, D): ");
        char code = sc.next().charAt(0);

        switch (code) {
            case 'A':
                System.out.println("Tầng 1: Sách văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Mã không hợp lệ! Vui lòng nhập A, B, C hoặc D.");
        }

        sc.close();
    }
}
