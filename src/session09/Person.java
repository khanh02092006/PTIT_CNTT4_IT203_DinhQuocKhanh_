package session09;

public class Person {
    protected String fullName;
    protected int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void display() {
        System.out.println("họ tên: " + fullName);
        System.out.println("tuổi: " + age);
    }
}
