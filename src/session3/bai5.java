package session3;

import java.util.Random;

public class bai5 {

    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int[] books = new int[n];
        Random rd = new Random();

        // khởi tạo mảng ngẫu nhiên
        for (int i = 0; i < n; i++) {
            books[i] = rd.nextInt(100) + 1; // 1 → 100
        }

        System.out.println("mảng trước khi sắp xếp:");
        displayBooks(books);

        sortBooks(books);

        System.out.println("mảng sau khi sắp xếp:");
        displayBooks(books);
    }
}
