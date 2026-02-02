package session7;

public class bai1 {
    public static void main(String[] args) {

        Student s1 = new Student("SV001", "nguyễn văn a");
        Student s2 = new Student("SV002", "trần thị b");
        Student s3 = new Student("SV003", "lê văn c");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        Student.displayTotalStudent();
    }
}
