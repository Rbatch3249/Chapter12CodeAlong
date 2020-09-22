package Classwork;

public abstract class Animal {
    //Fields, instance variables, state, properties,attributes
    private String food;
    //constructor
    public Animal(){
    }
    //AbstractMethods
    public abstract void eat();

    public void makeNoise(){
        System.out.println("Animals make noise");
    }
    //concrete methods
    public void roam(){
        System.out.println("Riding around and gettin it!");
    }
    public void giveShot(Animal a){
        System.out.println("Do horrible things to animal");
        a.makeNoise();
    }
}

