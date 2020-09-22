package lab1;

public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(12,17);
        Monitor monitor = new Monitor(resolution, "Intel", "S7");
        Dimension dimension = new Dimension(4,5,3);
        Case typeOfCase = new Case("Razer", "AMD", "Power", dimension);
        MotherBoard motherBoard = new MotherBoard("7", "Intel",4, 2,"BIOS" );
        PC pc = new PC(typeOfCase,monitor, motherBoard);
        pc.description();
        pc.powerUp();

    }
}
