package session09;

public class Employee1 {

    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0;
    }

    public void display() {
        System.out.println("tên: " + name);
        System.out.println("lương: " + calculateSalary());
    }
}
