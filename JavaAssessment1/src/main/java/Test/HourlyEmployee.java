package Test;

public class HourlyEmployee extends Employee implements IPayable {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String names, HireDate hireDate, double hourlyRate, double hoursWorked) {
        super(names, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public double calculatePay(){
        return this.hourlyRate * this.hoursWorked;
    }
}
