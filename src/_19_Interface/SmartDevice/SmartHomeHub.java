package _19_Interface.SmartDevice;

/*
* 필드에 각 가전이 들어있음
* 고유 메소드로 turnOnAll() -> 모든 가전을 전원 킴
* turnOffAll() -> 모든 가전 끄기
* showStatus() -> 모든 가전 상태 출력
* */

public class SmartHomeHub {
    private SmartConditioner air;
    private SmartLight lig;
    private SmartSpeaker spk;

    public SmartHomeHub(SmartConditioner air, SmartSpeaker spk, SmartLight lig) {
        this.air = air;
        this.spk = spk;
        this.lig = lig;
    }


    public void turnOnAll() {
        air.turnOn();
        lig.turnOn();
        spk.turnOn();
    }

    public void turnOffAll() {
        air.turnOff();
        lig.turnOff();
        spk.turnOff();
    }

    public void showStatue() {
        air.isTurnedOn();
        lig.isTurnedOn();
        spk.isTurnedOn();
    }

    public void turnOnAirConditioner() {
        air.turnOn();
    }
    public void turnOffAirConditioner() {
        air.turnOff();
    }
    public void tempUp() {
        air.tempUp();
    }
    public void tempDown() {
        air.tempDown();
    }

    public void turnOnLight() {
        lig.turnOn();
    }
    public void turnOffLight() {
        lig.turnOff();
    }
    public void brightDown() {
        lig.brightnessDown();
    }
    public void brightUp() {
        lig.brightnessUp();
    }

    public void turnOnSpeaker() {
        spk.turnOn();
    }
    public void turnOffSpeaker() {
        spk.turnOff();
    }

    public void play(String playListName) {
        spk.playTheSong(playListName);
    }
}
