package _19_Interface.SmartDevice;

/*
* 인터페이스 상속 받고 에어컨이랑 똑같이,
* 고유 속성값
* turnedOn, brightness = 50
* 고유 메서드
* 밝기 올리기, 내리기 +- 10씩, 전원 상태 확인
*
* */

public class SmartLight implements SmartDevice {

    private boolean turnedOn;
    private int brightness = 50;

    @Override
    public String getName() {
        return "스마트 라이트";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 킵니다. 설정 밝기: " + brightness);
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println(getName() + "의 전원을 끕니다.");
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

    public void brightnessUp() {
        if(turnedOn){
            brightness += 10;
            System.out.println("밝기를 올립니다. 현재 밝기: " + brightness);
        } else {
            System.out.println("현재 전원이 꺼져있습니다.");
        }
    }
    public void brightnessDown() {
        if(turnedOn){
            brightness -= 10;
            System.out.println("밝기를 내립니다. 현재 밝기: " + brightness);
        } else {
            System.out.println("현재 전원이 꺼져있습니다.");
        }
    }
}
