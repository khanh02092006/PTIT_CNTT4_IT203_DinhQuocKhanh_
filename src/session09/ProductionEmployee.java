package session09;

public class ProductionEmployee extends Employee {

    private int quantity;
    private double unitPrice;

    public ProductionEmployee(String name, int quantity, double unitPrice) {
        super(name);
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public double calculateSalary() {
        return quantity * unitPrice;
    }
}
