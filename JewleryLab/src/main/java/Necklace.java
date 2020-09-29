public class Necklace {
    private double price;
    private String name;
    private int item_id;
    private String dateCreated;

    public Necklace(double price, String name, int item_id, String dateCreated) {
        this.price = price;
        this.name = name;
        this.item_id = item_id;
        this.dateCreated = dateCreated;
    }

    public Necklace() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", item_id=" + item_id +
                ", dateCreated='" + dateCreated + '\'' +
                '}';
    }
}
