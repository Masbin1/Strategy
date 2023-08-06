// File: Main.java
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room Light", new LightPowerOnStrategy(), new LightPowerOffStrategy());
        Fan ceilingFan = new Fan("Ceiling Fan", new FanPowerOnStrategy(), new FanPowerOffStrategy());
        Door frontDoor = new Door("Front Door", new DoorPowerOnStrategy(), new DoorPowerOffStrategy());

        livingRoomLight.turnOn();
        livingRoomLight.turnOff();

        ceilingFan.turnOn();
        ceilingFan.turnOff();

        frontDoor.turnOn();
        frontDoor.turnOff();
    }
}
