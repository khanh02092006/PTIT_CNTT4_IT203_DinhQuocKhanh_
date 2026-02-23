package session10.src.bai03;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck("Vịt trời");
        Fish fish = new Fish("Cá chép");

        duck.swim();
        duck.fly();

        fish.swim();
        // fish.fly(); lỗi biên dịch
    }
}

