package Classwork;

public class Wolf extends Canine implements IPet{
    @Override
    public void eat() {
        System.out.println("rabbits");
    }

    @Override
    public void makeNoise(){
        System.out.println("OOOOOuwwlllll");
    }

    @Override
    public void beFriendly() {
        System.out.println("Wags Tail");
    }
}
