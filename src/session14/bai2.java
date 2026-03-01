package session14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai2 {
    static void main(String[] args) {
        Map<String,String> medicineList = new HashMap<>();
        medicineList.put("T01", "Paracetamol");
        medicineList.put("T02", "Ibuprofen");
        medicineList.put("T03", "Aspirin");
        medicineList.put("T04", "Amoxicillin");
        medicineList.put("T05", "Vitamin C");
        Scanner sc =new Scanner(System.in);
        System.out.println(" nhập mã thuốc :");
        String code = sc.nextLine();
        if(medicineList.containsKey(code)){
            System.out.println("tên thuốc :"+medicineList.get(code));
        }else {
            System.out.println(" ma thuoc khong ton tai");
        }

    }
}
