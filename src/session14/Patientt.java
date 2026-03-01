package session14;

public class Patientt {
    String name;
    int age;
    String department;

    public Patientt(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}
