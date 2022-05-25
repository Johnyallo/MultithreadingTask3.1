package ToyBox;

import static java.lang.Thread.currentThread;

public class ToyBox {
    static volatile boolean button;
    static int numbersOfInclusions = 5;
    static int startOfRange = 0;
    static final int SLEEPINGOFTOY = 2000;
    static final int SLEEPINGOFUSER = 1500;

    public static void switchOn() {
        while (startOfRange < numbersOfInclusions) {
            //ToyBox.button = true;
            if (button != true) {
                button = true;
                System.out.println("Button is switched ON.");
            }
            try {
                currentThread().join(SLEEPINGOFUSER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void switchOff() {
        while (startOfRange != numbersOfInclusions) {
            if (button) {
                button = false;
                System.out.println("Button is switched OFF.");
                startOfRange++;
            }
            try {
                currentThread().join(SLEEPINGOFTOY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.interrupted();
        }
    }
}
