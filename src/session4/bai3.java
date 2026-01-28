import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class bai3 {

    // tạo báo cáo bằng StringBuilder
    public static String buildReportWithStringBuilder(String[] transactions) {
        StringBuilder sb = new StringBuilder();

        // thời gian hệ thống
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        sb.append("=== BÁO CÁO GIAO DỊCH ===\n");
        sb.append("Thời gian tạo: ").append(now.format(fmt)).append("\n\n");

        for (String t : transactions) {
            sb.append(t).append("\n");
        }

        return sb.toString();
    }

    // tạo báo cáo bằng phép cộng chuỗi +
    public static String buildReportWithPlus(String[] transactions) {
        String report = "";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        report += "=== BÁO CÁO GIAO DỊCH ===\n";
        report += "Thời gian tạo: " + now.format(fmt) + "\n\n";

        for (String t : transactions) {
            report += t + "\n";
        }

        return report;
    }

    public static void main(String[] args) {

        // danh sách giao dịch
        String[] transactions = {
                "BK001 - 12/01/2026",
                "BK014 - 13/01/2026",
                "BK120 - 14/01/2026",
                "BK256 - 15/01/2026"
        };

        // đo thời gian với StringBuilder
        long start1 = System.nanoTime();
        String report1 = buildReportWithStringBuilder(transactions);
        long end1 = System.nanoTime();

        // đo thời gian với +
        long start2 = System.nanoTime();
        String report2 = buildReportWithPlus(transactions);
        long end2 = System.nanoTime();

        // in báo cáo (1 cái là đủ)
        System.out.println(report1);

        // in thời gian thực thi
        System.out.println("StringBuilder time: " + (end1 - start1) + " ns");
        System.out.println("String + time: " + (end2 - start2) + " ns");
    }
}
