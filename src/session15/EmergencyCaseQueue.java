package session15;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases;

    public EmergencyCaseQueue() {
        cases = new LinkedList<>();
    }

    // Thêm ca vào hàng đợi
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận ca của bệnh nhân: "
                + c.getPatient().getName());
    }

    // Lấy ca tiếp theo
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca nào.");
            return null;
        }
        EmergencyCase c = cases.poll();
        System.out.println("Đang xử lý ca của: "
                + c.getPatient().getName());
        return c;
    }
}