package session15;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public Patient getPatient() {
        return patient;
    }

    // Thêm bước xử lý (Push)
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Đã thêm bước: " + step.getDescription());
    }

    // Undo bước gần nhất (Pop)
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước nào để undo!");
            return null;
        }
        TreatmentStep removed = steps.pop();
        System.out.println("Đã undo bước: " + removed.getDescription());
        return removed;
    }

    // Hiển thị các bước đã thực hiện
    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý nào.");
            return;
        }

        System.out.println("=== Các bước xử lý của bệnh nhân: "
                + patient.getName() + " ===");

        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }
}