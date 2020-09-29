import java.util.ArrayList;
import java.util.Random;

public class Store extends Necklace {
    private String name;
    private String owner_name;
    private ArrayList<Necklace> products;

    public Store(String name, String owner_name, ArrayList<Necklace> products) {
        this.name = name;
        this.owner_name = owner_name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }
    public void sell(int itemId ) {
        for(int i = 0; i < products.size(); i++)
            if(products.get(i).getItem_id() == itemId){
                    products.remove(i);


            }
        }
        public void restock(){


        while(products.size() < 20){
        Random random = new Random();
            products.add(new Necklace(random.nextInt(3000),"Kay Jewlers", random.nextInt(2400),"2020"));

        }

        }







    }





