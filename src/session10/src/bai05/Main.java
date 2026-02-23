package session10.src.bai05;

public class Main {
    public static void main(String[] args) {
        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000);
        Employee manager = new Manager("Trần Thị B", 12000, 3000);

        System.out.println(staff.name);
        System.out.println("Lương cuối: " + staff.calculateSalary());

        System.out.println();

        System.out.println(manager.name);
        System.out.println("Lương cuối: " + manager.calculateSalary());
    }
}

