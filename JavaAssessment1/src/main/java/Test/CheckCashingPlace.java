package Test;

import java.util.ArrayList;

public class CheckCashingPlace {
    public static void main(String[] args) {

        Entrepreneur entrepreneur = new Entrepreneur();
        HumanResources humanResources = new HumanResources();
        HireDate hireDate = new HireDate(3,2020,24);
        HireDate hireDate1 = new HireDate(2,1994,12);
        SalariedEmployee salariedEmployee = new SalariedEmployee("James",hireDate,100000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Mike",hireDate1,40,40);
      IPayable[] people = {salariedEmployee, hourlyEmployee, entrepreneur};
      Employee[] employees = {salariedEmployee, hourlyEmployee};
        humanResources.issueBadge(employees);
        System.out.println("\n");
        System.out.println("Prior to sorting people by pay..");
        humanResources.payPerson(people);
        ArrayList<IPayable> unsortedPeople = new ArrayList<>();
        unsortedPeople.add(salariedEmployee);
        unsortedPeople.add(hourlyEmployee);
        unsortedPeople.add(entrepreneur);
        System.out.println();
        System.out.println("After sorting people by pay");
        humanResources.sortPeopleByIncome(unsortedPeople);





    }
}