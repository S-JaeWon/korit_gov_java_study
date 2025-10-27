package _19_Interface.SmartDevice;

/*
* 속성
* turnedOn, playListName = "발라드"
* 고유 메서드
* playListName을 파라미터로 받아서 해당 목록 재생하기
* */

public class SmartSpeaker implements SmartDevice{
    private boolean turnedOn;
    private String playListName = "발라드";

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    @Override
    public String getName() {
        return "스마트 스피커";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 킵니다. 현재 재생 중인 노래: " + playListName);
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다");
    }

    @Override
    public Boolean isTurnedOn() {
        if(turnedOn) {
            System.out.println(getName() + "의 전원이 켜져 있습니다.");
        } else {
            System.out.println(getName() + "의 전원이 꺼져 있습니다.");
        }
        return turnedOn;
    }

//    public void playTheSong(String playListName) {
//        System.out.println(playListName + "을 재생합니다.");
//    }
    public void playTheSong(String playListName) {
        this.playListName = playListName;
        System.out.println(playListName + "을 재생합니다.");
    }



}
