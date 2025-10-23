package _16_Class.Dog;

// 클래스의 정의
public class Dog {
    // 속성 -> 클래스의 필드
    String name;
    int age;
    String type;

    // 기능 -> 클래스의 메서드
    public void callName() {
        System.out.println("멍멍");
    }

    public void showInfo() {
        System.out.println("종 : " + type + ", 이름 : " + name + ", 나이 : " + age);
    }



}
