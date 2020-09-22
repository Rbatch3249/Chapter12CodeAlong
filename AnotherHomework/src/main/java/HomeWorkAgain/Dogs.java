package HomeWorkAgain;

public class Dogs extends Pets {

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public Dogs(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Bark Bark";
    }
}