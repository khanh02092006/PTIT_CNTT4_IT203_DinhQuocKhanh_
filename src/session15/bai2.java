package session15;

public class bai2 {
    public static void main(String[] args) {

        PatientQueue queue = new PatientQueue();

        queue.addPatient(new Patient("P01", "Nguyễn Văn A", 30));
        queue.addPatient(new Patient("P02", "Trần Thị B", 25));
        queue.addPatient(new Patient("P03", "Lê Văn C", 40));

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(queue.peekNextPatient());

        System.out.println("\nGọi khám:");
        queue.callNextPatient();

        System.out.println("\nDanh sách còn lại:");
        queue.displayQueue();
    }
}
