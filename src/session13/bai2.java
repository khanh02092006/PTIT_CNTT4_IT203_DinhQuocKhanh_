package session13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai2 {
    public static List<String> removeDuplicateAndSort(List<String> input) {

        List<String> uniqueList = new ArrayList<>();

        for (String medicine : input) {
            if (!uniqueList.contains(medicine)) { // kiểm tra phần tử có tồn tại trong danh sách chưa
                uniqueList.add(medicine);
            }
        }


        Collections.sort(uniqueList);

        return uniqueList;
    }
    static void main(String[] args) {
        List<String> medicines = new ArrayList<>();
        medicines.add("Paracetamol");
        medicines.add("Ibuprofen");
        medicines.add("Panadol");
        medicines.add("Paracetamol");
        medicines.add("Aspirin");
        medicines.add("Ibuprofen");

        List<String> result = removeDuplicateAndSort(medicines);

        System.out.println("Input: " + medicines);
        System.out.println("Output: " + result);
    }
}
