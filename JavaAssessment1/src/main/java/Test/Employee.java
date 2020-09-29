package Test;

import javax.naming.Name;

public class Employee extends Person{
HireDate hireDate;

    public Employee(String names, HireDate hireDate) {
        super(names);
        this.hireDate = hireDate;
    }

    public Employee(HireDate hireDate) {
        this.hireDate = hireDate;
    }

    public HireDate getHireDate() {
        return hireDate;
    }



    public String printBadge(){
        return "Name: " +this.getNames() + "\n" +
                "Type of employee: " + this.getClass().getSimpleName() + "\n" +
                "HireDate: " + this.getHireDate().getMonth() + "/" + this.getHireDate().getDay() + "/" + this.getHireDate().getYear();
    }


    }



