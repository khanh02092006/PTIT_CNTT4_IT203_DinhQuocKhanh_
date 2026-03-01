package session14;

import java.util.HashSet;
import java.util.Set;

public class bai3 {
    static void main(String[] args) {
        Set<String> medicine = new HashSet<>();
        medicine.add("Aspirin");
        medicine.add("Caffeine");
        medicine.add("Paracetamol");
        Set<String> allergy =new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");
        Set<String> warning = new HashSet<>(medicine);
        warning.retainAll(allergy);
        Set<String>safe =new HashSet<>(medicine);
        safe.removeAll(allergy);
        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}
