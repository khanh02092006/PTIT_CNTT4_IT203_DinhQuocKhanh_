import java.util.regex.*;

public class bai5 {
    public static void main(String[] args) {

        String[] logs = {
                "2026-01-28 | user: Khanh | action: BORROW | book: BK102",
                "2026-01-28 | user: Lan | action: RETURN | book: BK102",
                "2026-01-29 | user: Minh | action: BORROW | book: BK205"
        };

        String regex = "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*user:\\s*(\\w+)\\s*\\|\\s*action:\\s*(BORROW|RETURN)\\s*\\|\\s*book:\\s*(BK\\d+)";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if (matcher.find()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookCode = matcher.group(4);

                System.out.println("Ngày: " + date);
                System.out.println("User: " + user);
                System.out.println("Hành động: " + action);
                System.out.println("Mã sách: " + bookCode);
                System.out.println("------");

                if (action.equals("BORROW")) borrowCount++;
                if (action.equals("RETURN")) returnCount++;
            }
        }

        System.out.println("Tổng BORROW: " + borrowCount);
        System.out.println("Tổng RETURN: " + returnCount);
    }
}
