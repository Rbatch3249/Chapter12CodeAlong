package HomeWorkAgain;

public class Birds extends Pets {
        public Birds(String name) {
            super(name);
        }
        @Override
        public String speak() {
            return "Chirp Chirp";
        }
    }