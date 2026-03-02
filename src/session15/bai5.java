package session15;

public class bai5 {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        // Tạo bệnh nhân
        Patient p1 = new Patient("P01", "Nguyễn Văn A", 30);
        Patient p2 = new Patient("P02", "Trần Thị B", 25);

        // Tạo ca cấp cứu
        EmergencyCase case1 = new EmergencyCase(p1);
        EmergencyCase case2 = new EmergencyCase(p2);

        // Thêm vào Queue
        queue.addCase(case1);
        queue.addCase(case2);

        // Lấy ca đầu tiên xử lý
        EmergencyCase current = queue.getNextCase();

        // Thêm các bước xử lý (Stack)
        current.addStep(new TreatmentStep("Kiểm tra huyết áp", "09:00"));
        current.addStep(new TreatmentStep("Tiêm thuốc giảm đau", "09:05"));
        current.addStep(new TreatmentStep("Chụp X-quang", "09:10"));

        // Hiển thị bước
        current.displaySteps();

        // Undo bước gần nhất
        current.undoStep();

        // Hiển thị lại
        current.displaySteps();
    }
}
