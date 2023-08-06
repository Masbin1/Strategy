
// File: FanPowerOffStrategy.java
public class FanPowerOffStrategy implements PowerOffStrategy {
    @Override
    public void powerOff() {
        System.out.println("The fan is OFF");
    }
}
