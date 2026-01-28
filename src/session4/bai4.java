import java.util.Scanner;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ: ");
        String code = sc.nextLine();

        // regex từng phần
        String prefixRegex = "^[A-Z]{2}";
        String yearRegex = "^[A-Z]{2}20\\d{2}";
        String fullRegex = "^[A-Z]{2}20\\d{2}\\d{5}$";

        if (!code.matches(prefixRegex)) {
            System.out.println("Thiếu tiền tố TV hoặc tiền tố không hợp lệ");
        }
        else if (!code.matches(yearRegex)) {
            System.out.println("Năm không hợp lệ");
        }
        else if (!code.matches(fullRegex)) {
            System.out.println("Mã ngẫu nhiên phải gồm 5 chữ số");
        }
        else {
            System.out.println("Mã thẻ hợp lệ ✅");
        }
    }
}
