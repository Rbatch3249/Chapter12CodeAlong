package lab1;

public class Case {
    private String model;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimensions() {
        return dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

}
