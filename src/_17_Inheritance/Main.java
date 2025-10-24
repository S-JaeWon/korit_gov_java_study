package _17_Inheritance;

import _17_Inheritance.Message.Fancymessage;
import _17_Inheritance.Message.Message;
import _17_Inheritance.Message.SimpleMessage;

public class Main {
    public static void main(String[] args) {
        // 상속 -> 기존 클래스(부모 클래스)의 속성과 기능(메서드)를
        // 새로운 클래스(자식 클래스)를 물려받는 것

        // 코드의 재사용성 ↑, 계증 구조 설계 가능
        // 수정할 일이 있으면 자식 클래스 대신, 부모 클래스만 고치면 됨
        // 기존 클래스의 수정 대신 새로운 기능을 가진 자식 클래스 생성 가능
        // 개방 폐쇄의 원칙 -> 확장에는 열려있고, 수정에는 닫혀있음

        // 자식 클래스 -> 부모 클래스의 속성 및 기능 그대로 사용 가능
        // 필요한 기능을 추가 하거나 변경(오버라이딩)도 가능

        Animal animal1 = new Animal("호랑이", 5);
        animal1.move();

        Tiger tiger1 = new Tiger("호랑삼", 1, true);
        tiger1.move();
        tiger1.hunt();

        Human human = new Human();
        human.setAnimalName("철수");
        human.setAnimalAge(30);
        human.setLanguage("Korea");

        human.getAnimalName();
        human.read("책");

        Message message = new Message("안녕1");
        message.print();
        SimpleMessage simpleMessage = new SimpleMessage("안녕2");
        simpleMessage.print();
        Fancymessage fancymessage = new Fancymessage("안녕3");
        fancymessage.print();

    }
}
