package ShopAppLab;

import java.util.Arrays;

public class Customer {
    private String name;
    private Clothing[] clothingItems;
    private char size;


    public Customer(String name, Clothing[] clothingItems, char size) {
        this.name = name;
        this.clothingItems = clothingItems;
        this.size = size;
    }

    public Customer() {

    }

    public char getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
