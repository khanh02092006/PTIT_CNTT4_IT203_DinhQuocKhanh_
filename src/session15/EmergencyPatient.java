package session15;

public class EmergencyPatient {

    private String id;
    private String name;
    private int priority; // 1: cấp cứu, 2: thường
    private long arrivalOrder; // thứ tự đến

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(long arrivalOrder) {
        this.arrivalOrder = arrivalOrder;
    }

    @Override
    public String toString() {
        String type = (priority == 1) ? "Cấp cứu" : "Thường";
        return "ID: " + id + " | Tên: " + name + " | Loại: " + type;
    }
}