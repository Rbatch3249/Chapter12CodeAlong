package Test;

public class SalariedEmployee extends Employee implements IPayable{
    private double salary;

    public SalariedEmployee(String names, HireDate hireDate, double salary) {
        super(names, hireDate);
        this.salary = salary;
    }

    public SalariedEmployee(HireDate hireDate, double salary) {
        super(hireDate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }
    public double calculatePay(){
       return getSalary();
    }
}
