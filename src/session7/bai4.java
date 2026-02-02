package session7;

public class bai4 {
    public static void main(String[] args) {

        ClassRoom s1 = new ClassRoom("an");
        ClassRoom s2 = new ClassRoom("binh");
        ClassRoom s3 = new ClassRoom("chi");

        s1.payFund(100);
        s2.payFund(200);
        s3.payFund(150);

        ClassRoom.showClassFund();
    }
}
