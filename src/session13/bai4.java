package session13;

import java.util.LinkedList;

public class bai4 {

    private LinkedList<String> waitingList = new LinkedList<>();

    // Bệnh nhân thường -> thêm cuối
    public void patientCheckIn(String name) {
        waitingList.addLast(name);
    }

    // Bệnh nhân cấp cứu -> thêm đầu
    public void emergencyCheckIn(String name) {
        waitingList.addFirst(name);
    }

    // Gọi bệnh nhân
    public void treatPatient() {
        if (!waitingList.isEmpty()) {
            String name = waitingList.removeFirst();

            if (name.equals("C")) {
                System.out.println("Đang cấp cứu: " + name);
            } else {
                System.out.println("Đang khám: " + name);
            }
        } else {
            System.out.println("Không còn bệnh nhân.");
        }
    }

    // Hàm main để chạy
    public static void main(String[] args) {

        bai4 er = new bai4();

        // CheckIn A
        er.patientCheckIn("A");

        // CheckIn B
        er.patientCheckIn("B");

        // Emergency C
        er.emergencyCheckIn("C");

        // Điều trị
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}