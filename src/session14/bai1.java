package session14;

import java.util.HashSet;
import java.util.Set;

public class bai1 {
    static void main(String[] args) {
        Set<String> patients = new HashSet<>();
        patients.add(" đinh quốc khánh - nam định ");
        patients.add("Trần Thị B – Thái Bình");
        patients.add("đinh quốc khánh – Yên Bái");
        patients.add("Lê Văn C – Hưng Yên");
        System.out.println(patients);
        System.out.println(" danh sách gọi khám ");
        for (String name:patients){
            System.out.println(name);
        }
    }
}
