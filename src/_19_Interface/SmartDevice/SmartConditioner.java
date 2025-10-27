package _19_Interface.SmartDevice;

public class SmartConditioner implements SmartDevice {
    /*
     * getName, turnOn, TurnOff, isTurnedOn
     *
     * SmartAirConditioner 클래스 -> SmartDevice 상속
     * 고유 속성
     * boolean turnedOn
     * int temperature = 24
     * getName -> 오버라이드 해서 "스마트 에어컨" 리턴
     * turnOn -> turnedOn = true
     * turnOn -> "[가전이름]의 전원을 킵니다. 설정 온도 : [온도]"
     * turnOff -> turnedOn = false
     * isTurnedOn -> 전원 상태 리턴
     * 고유 메서드로 온도 올리기, 내리기
     * 전원이 꺼져 있으면 "현재 전원이 꺼져있습니다.'
     *
     * */

    private boolean turnedOn;
    private int temperature = 24;


    @Override
    public String getName() {
        return "스마트 에어컨";
    }

    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println(getName() + "의 전원을 킵니다. 설정 온도: " + temperature + "℃");
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

    public void tempUp() {
        if(turnedOn){
            System.out.println("온도를 올립니다.");
            temperature++;
            System.out.println("현재 온도 : " + temperature + "℃");
        } else {
            System.out.println("현재 전원이 꺼져있습니다.");
        }
    }
    public void tempDown() {
        if(turnedOn){
            System.out.println("온도를 내립니다.");
            temperature--;
            System.out.println("현재 온도 : " + temperature + "℃");
        } else {
            System.out.println("현재 전원이 꺼져있습니다.");
        }
    }
}
