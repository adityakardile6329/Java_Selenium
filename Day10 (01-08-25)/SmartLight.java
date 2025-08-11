package devices;


public class SmartLight implements SmartDevice, Adjustable {
    private boolean isOn = false;
    private int brightness = 5;
    private String color = "White";

    @Override
    public void switchOn() {
        isOn = true;
        System.out.println("Light switched ON.");
    }

    @Override
    public void switchOff() {
        isOn = false;
        System.out.println("Light switched OFF.");
    }

    @Override
    public void increaseLevel() {
        if (brightness < 10) {
            brightness++;
        }
        System.out.println("Light brightness increased to: " + brightness);
    }

    @Override
    public void decreaseLevel() {
        if (brightness > 0) {
            brightness--;
        }
        System.out.println("Light brightness decreased to: " + brightness);
    }

    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Light color changed to: " + color);
    }
}