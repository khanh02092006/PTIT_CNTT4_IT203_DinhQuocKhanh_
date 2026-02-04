package session09;

public class bai1 {
    public static void main(String[] args) {
        Student student = new Student(
                "nguyễn văn a",
                20,
                "sv001",
                8.5
        );

        System.out.println("=== thông tin sinh viên ===");
        student.display();
    }
}
