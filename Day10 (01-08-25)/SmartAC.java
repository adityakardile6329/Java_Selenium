package devices;

public class SmartAC implements SmartDevice, Adjustable {
    private boolean isOn = false;
    private int temperature = 24;

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("AC is now ON.");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("AC is now OFF.");
    }

    @Override
    public void increaseLevel() {
        temperature++;
        System.out.println("Temperature increased to " + temperature + "°C");
    }

    @Override
    public void decreaseLevel() {
        temperature--;
        System.out.println("Temperature decreased to " + temperature + "°C");
    }
}