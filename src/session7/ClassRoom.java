package session7;

public class ClassRoom {
    // ===== biến static (dùng chung cho cả lớp) =====
    private static double classFund = 0;

    // ===== biến instance (riêng từng sinh viên) =====
    private String studentName;

    // constructor
    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    // sinh viên đóng tiền vào quỹ
    public void payFund(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount);
        }
    }

    // xem tổng quỹ lớp
    public static void showClassFund() {
        System.out.println("tổng quỹ lớp: " + classFund);
    }
}
