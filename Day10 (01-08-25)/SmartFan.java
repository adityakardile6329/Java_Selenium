package devices;

public class SmartFan implements SmartDevice, Adjustable {
    private boolean isRunning = false;
    private int speed = 1;

    @Override
    public void switchOn() {
        isRunning = true;
        System.out.println("Fan is turned ON.");
    }

    @Override
    public void switchOff() {
        isRunning = false;
        System.out.println("Fan is turned OFF.");
    }

    @Override
    public void increaseLevel() {
        if (speed < 5) speed++;
        System.out.println("Fan speed increased to: " + speed);
    }

    @Override
    public void decreaseLevel() {
        if (speed > 1) speed--;
        System.out.println("Fan speed decreased to: " + speed);
    }
}

