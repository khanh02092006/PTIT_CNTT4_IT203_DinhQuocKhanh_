import java.util.Scanner;

public class bai2 {
    // hàm chuẩn hóa tên tác giả: viết hoa chữ cái đầu mỗi từ
    public static String formatAuthor(String author) {
        author = author.trim().replaceAll("\\s+", " ");
        String[] words = author.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            sb.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("nhập tên tác giả: ");
        String author = sc.nextLine();

        System.out.print("nhập thể loại: ");
        String category = sc.nextLine(); // nhập cho đủ yêu cầu (không dùng vẫn ok)

        // xử lý tên sách
        bookName = bookName.trim()
                .replaceAll("\\s+", " ")
                .toUpperCase();

        // xử lý tác giả
        author = formatAuthor(author);

        // xuất kết quả
        System.out.println("[" + bookName + "] - Tác giả: " + author);
    }
}
