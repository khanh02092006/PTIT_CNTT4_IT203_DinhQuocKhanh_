package session3;

import java.util.Scanner;

public class bai1 {

    public static int[] addBookToLibraries(int n) {
        Scanner sc = new Scanner(System.in);
        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }

        return books;
    }

    public static void displayLibraries(int[] arr) {
        System.out.println("=== danh sách mã sách ===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("nhập số lượng sách: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] libraries = addBookToLibraries(n);
        displayLibraries(libraries);
    }
}
