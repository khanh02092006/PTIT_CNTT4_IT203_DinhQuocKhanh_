package session15;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack;

    // Constructor
    public MedicationProcessChecker() {
        stack = new Stack<>();
    }

    // Kiểm tra quy trình
    public boolean checkProcess(String[] actions) {

        reset(); // đảm bảo stack rỗng trước khi kiểm tra

        for (int i = 0; i < actions.length; i++) {

            String action = actions[i];

            if (action.equalsIgnoreCase("PUSH")) {
                stack.push("Phát thuốc");
                System.out.println("Bước " + (i + 1) + ": PUSH → Phát thuốc");

            } else if (action.equalsIgnoreCase("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Bước " + (i + 1) + ": POP → LỖI! Không thể hoàn tất vì chưa phát thuốc.");
                    return false;
                }

                stack.pop();
                System.out.println("Bước " + (i + 1) + ": POP → Hoàn tất phát thuốc");

            } else {
                System.out.println("Bước " + (i + 1) + ": Lệnh không hợp lệ!");
                return false;
            }
        }

        // Kiểm tra cuối ca
        if (!stack.isEmpty()) {
            System.out.println("Kết thúc ca trực: LỖI! Còn " + stack.size() + " thuốc chưa hoàn tất.");
            return false;
        }

        System.out.println("Kết thúc ca trực: Quy trình hợp lệ.");
        return true;
    }

    // Reset Stack
    public void reset() {
        stack.clear();
    }
}
