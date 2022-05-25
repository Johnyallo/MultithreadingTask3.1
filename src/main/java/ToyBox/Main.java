package ToyBox;

public class Main {
    public static void main(String[] args) {
        new Thread(null, ToyBox::switchOn, "player").start();
        new Thread(null, ToyBox::switchOff, "toy").start();
    }
}
