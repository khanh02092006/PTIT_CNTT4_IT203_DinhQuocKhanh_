package HN_K24_CNTT4_DINHQUOCKHANH_002.bai1;

import java.util.*;

public class bai1 {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(n<=0){
            System.out.println(" số lượng không hợp lệ");
            return;
        }
        List<Integer> List =new ArrayList<>();
        for (int i=0;i<n;i++){
            List.add(sc.nextInt());
        }
        Set<Integer> set =new HashSet<>(List);
        List<Integer> result =new ArrayList<>(set);
        Collections.sort(result);
        System.out.println(" số học sinh nhận học bổng: " +result.size());
        System.out.print("danh sách đã sắp xếp :");
        for(int id:result){
            System.out.print(id +" ");
        }
    }
}
