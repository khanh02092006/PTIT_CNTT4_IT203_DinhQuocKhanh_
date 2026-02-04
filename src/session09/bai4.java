package session09;

import session09.Animal1;
import session09.Dog1;

public class bai4 {
    public static void main(String[] args) {

        Animal1 animal = new Dog1();

        // gọi phương thức chung (đa hình)
        animal.sound();

        // gọi phương thức riêng của Dog1 bằng instanceof + ép kiểu
        if (animal instanceof Dog1) {
            Dog1 dog = (Dog1) animal;
            dog.guardHouse();
        }
    }
}
