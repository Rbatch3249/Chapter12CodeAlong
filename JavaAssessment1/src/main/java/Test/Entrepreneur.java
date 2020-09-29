package Test;

public class Entrepreneur extends Person implements IPayable {
    private double income;
    public Entrepreneur(){
        super();
    }

    public Entrepreneur(String names, double income) {
        super(names);
        this.income = income;
    }

    public Entrepreneur(double income) {
        this.income = income;
    }

    public Entrepreneur(String names) {
        super(names);
    }
    public double calculatePay(){
        return income;
    }
}
