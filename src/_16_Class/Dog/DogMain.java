package _16_Class.Dog;


public class DogMain {
    public static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog1 = new Dog(); // Dog 클래스를 가지고 dog1 이라는 객체 생성

        // 생성된 객체에 속성 값 대입 또는 변경
        dog1.name = "보리";
        dog1.age = 3;
        dog1.type = "말티푸";

        dog1.name = "보리1";

        System.out.println(dog1.name);
        System.out.println(dog1.age);
        System.out.println(dog1.type);

        // 생성된 객체의 메서드 호출 방법
        dog1.callName();
        dog1.showInfo();


    }
}
