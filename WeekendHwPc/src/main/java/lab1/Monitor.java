package lab1;

public class Monitor {
    public Resolution resolution;
    String manufacturer;
    String model;
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " " + "in color "+ color);
    }

    public Monitor(Resolution resolution, String manufacturer, String model) {
        this.resolution = resolution;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Monitor() {
    }

}
