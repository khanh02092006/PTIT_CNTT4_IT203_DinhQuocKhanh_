package session13;

import java.util.*;

public class bai5 {

    static List<Patient> patientList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Thoát");

            System.out.print("Chọn: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    // ===== 1. Tiếp nhận =====
    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        // Kiểm tra trùng ID
        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }

        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = sc.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công.");
    }

    // ===== 2. Cập nhật chẩn đoán =====
    public static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = sc.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                String newDiagnosis = sc.nextLine();
                p.setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }

    // ===== 3. Xuất viện =====
    public static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = sc.nextLine();

        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }

    // ===== 4. Sắp xếp =====
    public static void sortPatients() {

        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                // Tuổi giảm dần
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }

                // Nếu tuổi bằng nhau -> sắp xếp tên A-Z
                return p1.getFullName().compareTo(p2.getFullName());
            }
        });

        System.out.println("\nDanh sách sau khi sắp xếp:");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}