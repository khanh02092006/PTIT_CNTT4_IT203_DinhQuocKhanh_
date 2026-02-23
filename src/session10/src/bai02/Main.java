package session10.src.bai02;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Thống nhất");

        System.out.print(car.brand + " - Cách di chuyển: ");
        car.move();

        System.out.print(bicycle.brand + " - Cách di chuyển: ");
        bicycle.move();
    }
}

