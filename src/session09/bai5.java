package session09;

public class bai5 {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("an", 8000000, 2000000));
        employees.add(new ProductionEmployee("bình", 500, 20000));
        employees.add(new OfficeEmployee("chi", 9000000, 1500000));

        double totalSalary = 0;

        for (Employee e : employees) {
            e.display();
            System.out.println("-----------------");
            totalSalary += e.calculateSalary();
        }

        System.out.println("tổng lương phải trả: " + totalSalary);
    }
}
