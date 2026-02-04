package session09;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void display() {
        System.out.println("tên nhân viên: " + name);
        System.out.println("lương cơ bản: " + baseSalary);
    }
}
