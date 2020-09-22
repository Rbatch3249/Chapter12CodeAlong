package HomeWorkAgain;

import java.util.Scanner;

abstract public class Pets implements IGreet {
public abstract void greet();

    private String name;
    public Pets(String name){
        this.name = name;
    }
    public String speak(){
        return "This is me speaking.";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}