//package session7;
//
//public class bai3 {
//    static void main(String[] args) {
//        double[] scores = {6.5, 8.0, 4.5};
//
//        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
//        System.out.println();
//        System.out.println(">> Kết quả xử lý:");
//
//
//        double avg = ScoreUtils.calculateAverage(scores);
//        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);
//
//        // kiểm tra từng điểm
//        for (double s : scores) {
//            boolean pass = ScoreUtils.checkPass(s);
//            System.out.println("- Điểm " + s + ": " + (pass ? "Đạt" : "Trượt"));
//        }
//
//
//    }
//}
