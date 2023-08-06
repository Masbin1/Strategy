
// File: DoorPowerOffStrategy.java
public class DoorPowerOffStrategy implements PowerOffStrategy {
    @Override
    public void powerOff() {
        System.out.println("The door is CLOSED");
    }
}