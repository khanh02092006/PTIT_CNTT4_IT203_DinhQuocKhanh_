package session13;

import java.util.ArrayList;
import java.util.Iterator;

public class bai1 {
    static void main(String[] args) {
        ArrayList<Double> temperatures = new ArrayList<>();
        System.out.println(temperatures);
        temperatures.add(36.5);
        temperatures.add(40.2);
        temperatures.add(37.0);
        temperatures.add(12.5);
        temperatures.add(39.8);
        temperatures.add(99.9);
        temperatures.add(36.8);
        System.out.println(" danh sách ban đâu " + temperatures);
        Iterator<Double> iterator =temperatures.iterator();
        while (iterator.hasNext()){ // còn phần ử nào phía sau kh?
            double temp= iterator.next(); // lấy phần tử hiện tại sang pần tử kế tiếp
            if(temp <34.0 || temp >42.0) {
                iterator.remove(); // xoá phần tử vừa lấy

            }

        }
        System.out.println(" danh sách sau khi lọc " + temperatures);
        double sum=0;
        for(double temp :temperatures){
            sum+= temp;

        }
        double average = sum / temperatures.size();

        System.out.printf("Nhiệt độ trung bình: %.2f", average);


    }
}
