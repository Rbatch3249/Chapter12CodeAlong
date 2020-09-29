import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Necklace> products = new ArrayList<Necklace>();
        Necklace roseGold = new Necklace(3000.99,"Big Ice", 3452,"02/12/2009");
        Store jewls = new Store("Batchelor and Furlong Jewlz","Ryan M. Batchelor",products );
   products.add(roseGold);
    jewls.sell(23);
        System.out.println(products);
        jewls.sell(roseGold.getItem_id());
        jewls.restock();
        System.out.println(products);
    }
}
