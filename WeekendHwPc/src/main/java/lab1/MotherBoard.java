package lab1;

public class MotherBoard {
    private String model;
    String manufacturer;
    int ramSlots;
    int cardSlots;
    String bios;

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println(programName);

    }

}
