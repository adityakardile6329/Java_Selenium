package devices;

public class SmartTV implements SmartDevice, Adjustable {
    private boolean isOn = false;
    private int volume = 10;

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("TV is now ON.");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("TV is now OFF.");
    }

    @Override
    public void increaseLevel() {
        if (volume < 100) volume++;
        System.out.println("Volume increased to: " + volume);
    }

    @Override
    public void decreaseLevel() {
        if (volume > 0) volume--;
        System.out.println("Volume decreased to: " + volume);
    }
}