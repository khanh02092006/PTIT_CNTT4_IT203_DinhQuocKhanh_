package session09;

public class Student extends Person {
    private String studentId;
    private double avgScore;

    public Student() {
    }

    public Student(String fullName, int age, String studentId, double avgScore) {
        super(fullName, age);
        this.studentId = studentId;
        this.avgScore = avgScore;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("mã sinh viên: " + studentId);
        System.out.println("điểm trung bình: " + avgScore);
    }
}

