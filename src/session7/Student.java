package session7;

public class Student
{
    private  String maSv;
    private  String tenSv;
    private   static int totalStudent = 0;
    public  Student(String maSv ,String tenSv){
        this.maSv =maSv;
        this.tenSv =tenSv;
        totalStudent++;

    }
    public void  displayInfo(){
        System.out.println("mã sv: " + maSv + ", tên sv: " + tenSv);
    }
    public static void displayTotalStudent() {
        System.out.println("tổng số sinh viên đã tạo: " + totalStudent);
    }
}
