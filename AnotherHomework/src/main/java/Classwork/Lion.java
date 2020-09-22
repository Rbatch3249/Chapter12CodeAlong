package Classwork;

public class Lion extends Feline implements IPet, Lion.IHunter {

        public void eat() {
            System.out.println("Lions eat people");
        }

        @Override
        public void makeNoise() {
            System.out.println("Roooaarr");
        }

    @Override
    public void beFriendly() {
        System.out.println("look in misery cos i'm not beefy");
    }

    @Override
    public void huntsHuman() {
        System.out.println("eats peeps");
    }

    public static interface IHunter {
        void huntsHuman();
    }
}
