//package session15;
//
//public class bai1 {
//    public static void main(String[] args) {
//
//        MedicalRecordHistory history = new MedicalRecordHistory();
//
//        history.addEdit(new EditAction("Cập nhật chẩn đoán", "10:00 02/03/2026"));
//        history.addEdit(new EditAction("Thêm thuốc mới", "10:15 02/03/2026"));
//        history.addEdit(new EditAction("Sửa liều thuốc", "10:30 02/03/2026"));
//
//        System.out.println("\nChỉnh sửa gần nhất:");
//        System.out.println(history.getLatestEdit());
//
//        System.out.println("\nUndo chỉnh sửa:");
//        history.undoEdit();
//
//        System.out.println("\nLịch sử hiện tại:");
//        history.displayHistory();
//    }
//}
