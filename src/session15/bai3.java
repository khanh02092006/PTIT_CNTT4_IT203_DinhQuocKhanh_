package session15;

public class bai3 {
    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};
        String[] actions2 = {"PUSH", "POP", "POP"};
        String[] actions3 = {"PUSH", "PUSH", "POP"};

        System.out.println("=== Kiểm tra ca 1 ===");
        checker.checkProcess(actions1);

        System.out.println("\n=== Kiểm tra ca 2 ===");
        checker.checkProcess(actions2);

        System.out.println("\n=== Kiểm tra ca 3 ===");
        checker.checkProcess(actions3);
    }
}