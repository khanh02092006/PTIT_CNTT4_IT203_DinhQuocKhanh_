package session14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bai4 {
    static void main(String[] args) {
        List<String> diseases= new ArrayList<>();
        diseases.add("cúm A ");
        diseases.add("Sốt xuất huyết");
        diseases.add("Cúm A");
        diseases.add("Covid-19");
        diseases.add("Cúm A");
        diseases.add("Sốt xuất huyết");
        Map<String,Integer> report = new TreeMap<>();
        for (String disease : diseases) {
            if (report.containsKey(disease)) {
                report.put(disease, report.get(disease) + 1);

            } else {
                report.put(disease, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : report.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
