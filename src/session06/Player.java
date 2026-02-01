package session06;

import java.util.Date;

public class Player {
    private  String maCauthu;
    private  String hoTen;
    private  String gioiTinh;
    private Date ngaySinh;
    private  String queQuan;
    private  String viTri;
    private Double giatriChuyendoi;
    public  Player(){

    }

    public Player(String maCauthu, String hoTen, String gioiTinh, Date ngaySinh, String queQuan, String viTri, Double giatriChuyendoi) {
        this.maCauthu = maCauthu;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.viTri = viTri;
        this.giatriChuyendoi = giatriChuyendoi;
    }


    public void settMaCauthu(String maCauthu) {
        this.maCauthu =maCauthu;

    }

    public void setHoTen(String hoTen) {

       this.hoTen =hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh( Date ngaySinh) {
        this.ngaySinh =ngaySinh;
    }

    public void setQueQuan(String queQuan) {
     this.queQuan =queQuan;
    }

    public void setViTri( String viTri) {
        this.viTri =viTri;
    }

    public void setGiatriChuyendoi(Double giatriChuyendoi) {
       this.giatriChuyendoi =giatriChuyendoi;

    }
    public  void hienthiThongTin(){
        System.out.println(" mã cầu thủ " + maCauthu);
        System.out.println("họ tên :" +hoTen);
        System.out.println("giới tính " +gioiTinh);
        System.out.println("ngày sinh" + ngaySinh);
        System.out.println("quê quán " +queQuan);
        System.out.println("vị trí " +viTri);
        System.out.println(" gia trị chuyển đổi "+ giatriChuyendoi);
    }


}
