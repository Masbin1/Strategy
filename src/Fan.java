
// File: Fan.java
public class Fan {
    private String name;
    private PowerOnStrategy powerOnStrategy;
    private PowerOffStrategy powerOffStrategy;

    public Fan(String name, PowerOnStrategy powerOnStrategy, PowerOffStrategy powerOffStrategy) {
        this.name = name;
        this.powerOnStrategy = powerOnStrategy;
        this.powerOffStrategy = powerOffStrategy;
    }

    public void turnOn() {
        System.out.println(name + ": ");
        powerOnStrategy.powerOn();
    }

    public void turnOff() {
        System.out.println(name + ": ");
        powerOffStrategy.powerOff();
    }
}
