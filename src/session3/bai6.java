import java.util.Scanner;

public class bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {12, 5, 99, 34, 7, 60, 18};
        int n = books.length;

        while (true) {
            printBooks(books, n);

            if (n == 0) {
                System.out.println("Không còn sách để xóa.");
                break;
            }

            System.out.print("Nhập mã sách cần xóa: ");
            int bookId = sc.nextInt();

            n = deleteBook(books, n, bookId);

            System.out.print("Bạn có muốn xóa tiếp không? (y/n): ");
            sc.nextLine(); // bỏ dòng thừa
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy mã sách " + bookId);
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Đã xóa mã sách " + bookId);
        return n - 1;
    }

    public static void printBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Kho sách rỗng");
            return;
        }

        System.out.print("Danh sách sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
