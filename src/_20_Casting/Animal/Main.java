package _20_Casting.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.speak();
        dog1.wagTail();

        // 업캐스팅 (자식 -> 부모)
        Animal a = new Dog();
        a.speak();
        // a.wagTail(); 자식만 가지고 있는 클래스 호출 x, 참조는 부모를 하고 있기 때문

        // 다운캐스팅 (부모 -> 자식) 자식 타입을 명시
        ((Dog) a).wagTail();

        Animal a2 = dog1;
        Dog dog2 = (Dog) a2;

        // 다양한 자식들을 하나의 클래스 타입으로 처리 가능
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog[] dogs = {
                dog3,
                dog4,
                dog5
        };

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = {
                dog,
                cat,
                tiger
        };

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
