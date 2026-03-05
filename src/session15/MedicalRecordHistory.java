//import java.util.Stack;
//
//public class MedicalRecordHistory {
//
//    private Stack<Edi> history;
//
//    // Constructor
//    public MedicalRecordHistory() {
//        history = new Stack<>();
//    }
//
//    // Thêm chỉnh sửa (Push vào Stack)
//    public void addEdit(EditAction action) {
//        history.push(action);
//        System.out.println("Đã thêm chỉnh sửa: " + action.getDescription());
//    }
//
//    public EditAction undoEdit() {
//        if (!history.isEmpty()) {
//            EditAction removed = history.pop();
//            System.out.println("Đã undo: " + removed.getDescription());
//            return removed;
//        } else {
//            System.out.println("Không có chỉnh sửa để undo!");
//            return null;
//        }
//    }
//
//    // Xem chỉnh sửa gần nhất (Peek)
//    public EditAction getLatestEdit() {
//        if (!history.isEmpty()) {
//            return history.peek();
//        } else {
//            System.out.println("Không có chỉnh sửa nào!");
//            return null;
//        }
//    }
//
//    // Kiểm tra Stack có rỗng không
//    public boolean isEmpty() {
//        return history.isEmpty();
//    }
//
//    // Hiển thị toàn bộ lịch sử chỉnh sửa
//    public void displayHistory() {
//        if (history.isEmpty()) {
//            System.out.println("Lịch sử chỉnh sửa trống.");
//        } else {
//            System.out.println("=== Danh sách chỉnh sửa ===");
//            for (EditAction action : history) {
//                System.out.println(action);
//            }
//        }
//    }
//}