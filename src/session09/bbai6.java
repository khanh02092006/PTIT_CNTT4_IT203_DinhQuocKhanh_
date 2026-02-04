package session09;

import java.util.ArrayList;
import java.util.List;

public class bbai6 {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(3));
        shapes.add(new Rectangle(4, 5));
        shapes.add(new Circle(2.5));

        double totalArea = 0;

        for (Shape s : shapes) {
            totalArea += s.area(); // đa hình
        }

        System.out.println("tổng diện tích: " + totalArea);
    }
}
