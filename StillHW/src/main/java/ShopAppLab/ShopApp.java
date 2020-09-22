package ShopAppLab;

public class ShopApp {
    public double calcTotal(Clothing[] clothingPrice ){
        return clothingPrice.length;
    }

    public char measure(Customer measurement) {
        return measurement.getSize();
    }
    public double employeePriceAfterDisc(Employee employeeDisc){
        return employeeDisc.getDiscount();
    }
}
