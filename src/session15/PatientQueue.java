package session15;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue;

    // Constructor
    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Thêm bệnh nhân vào hàng đợi (Enqueue)
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân: " + p.getName());
    }

    // Gọi bệnh nhân tiếp theo (Dequeue)
    public Patient callNextPatient() {
        if (!queue.isEmpty()) {
            Patient p = queue.poll();
            System.out.println("Đang khám: " + p.getName());
            return p;
        } else {
            System.out.println("Không có bệnh nhân trong hàng đợi!");
            return null;
        }
    }

    // Xem bệnh nhân tiếp theo (Peek)
    public Patient peekNextPatient() {
        if (!queue.isEmpty()) {
            return queue.peek();
        } else {
            System.out.println("Không có bệnh nhân nào!");
            return null;
        }
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị toàn bộ hàng đợi
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống.");
        } else {
            System.out.println("=== Danh sách bệnh nhân chờ khám ===");
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
    }
}
