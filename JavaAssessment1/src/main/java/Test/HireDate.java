package Test;

public class HireDate {
    private int month;
    private int year;
    private int day;

    public HireDate(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getDay() {
        return day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
