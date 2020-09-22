package ShopAppLab;

public class Employee extends Customer {
    private final double discount;

    public Employee(double discount) {
        super();
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "discount=" + discount +
                '}';
    }
}
