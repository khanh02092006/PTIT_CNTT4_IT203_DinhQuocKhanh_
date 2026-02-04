package session09;

public class Circle extends Shape {

    private double radius;

    // constructor không tham số
    public Circle() {
    }

    // constructor có tham số (overload)
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // overload phương thức tính diện tích
    public double area(double r) {
        return Math.PI * r * r;
    }
}
