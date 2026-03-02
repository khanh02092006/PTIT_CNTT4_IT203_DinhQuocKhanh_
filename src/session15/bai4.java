package session15;

public class bai4 {
    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("E01", "Nguyễn A", 2));
        eq.addPatient(new EmergencyPatient("E02", "Trần B", 1));
        eq.addPatient(new EmergencyPatient("E03", "Lê C", 2));
        eq.addPatient(new EmergencyPatient("E04", "Phạm D", 1));

        System.out.println("\nThứ tự khám:");
        while (eq.callNextPatient() != null) {
        }
    }
}