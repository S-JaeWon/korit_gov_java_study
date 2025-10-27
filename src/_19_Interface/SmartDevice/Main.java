package _19_Interface.SmartDevice;

public class Main {
    public static void main(String[] args) {

        SmartHomeHub smartHomeHub = new SmartHomeHub(
                new SmartConditioner(),
                new SmartSpeaker(),
                new SmartLight()
        );

        smartHomeHub.turnOnAll();
        smartHomeHub.showStatue();
        smartHomeHub.turnOffAll();
        smartHomeHub.turnOnAirConditioner();
//        smartHomeHub.turnOffAirConditioner();
        smartHomeHub.tempUp();
        smartHomeHub.tempDown();
        smartHomeHub.turnOnLight();
//        smartHomeHub.turnOffLight();
        smartHomeHub.brightUp();
        smartHomeHub.brightDown();
        smartHomeHub.turnOnSpeaker();
//        smartHomeHub.turnOffSpeaker();

        smartHomeHub.play("힙합");

    }
}
