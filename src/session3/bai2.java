package session3;

import java.util.Scanner;

public class bai2 {

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhập tên sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.println("\ndanh sách sách:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nnhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if (index != -1) {
            System.out.println("tìm thấy sách tại vị trí " + index);
        } else {
            System.out.println("sách không tồn tại");
        }
    }
}
