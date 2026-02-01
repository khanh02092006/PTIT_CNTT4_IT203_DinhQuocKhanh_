package session06;

import java.util.Date;

public class Main {
     public  static void main(String[] args) {
         Player p1 = new Player();
         p1.settMaCauthu("CT01");
         p1.setHoTen("Đinh Quốc Khánh ");
         p1.setGioiTinh(" nam");
         p1.setNgaySinh(new Date());
         p1.setQueQuan(" nam định ");
         p1.setViTri("hậu vệ ");
         p1.setGiatriChuyendoi(10.5);

         Player p2 =new Player(
                 "CT02", "ĐINH văn a","nam",new Date(),"ha noi", "tien ve",8.3
         );
         System.out.println(" thng tin cầu thủ 1");
         p1.hienthiThongTin();
         System.out.println(" thng tin cầu thủ 2");
         p2.hienthiThongTin();
    }

}

