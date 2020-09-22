package lab1;

public class PC {
    private Case pcCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC() {

    }

    public PC(Case pcCase, Monitor monitor, MotherBoard motherBoard) {
        this.pcCase = pcCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getPcCase() {
        return pcCase;
    }

    public void setPcCase(Case pcCase) {
        this.pcCase = pcCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
    private void drawLogo(){
        monitor.drawPixelAt(12,42, "blue");
    }
    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today");
    }
    public void powerUp(){
        pcCase.pressPowerButton();
        drawLogo();
        motherBoard.loadProgram("Fall Candles");
    }
}
