package _20_Casting.Animal;

public class Main2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Animal animal1 = new Animal();

        // instanceof
        // [객체] instanceof [클래스]
        // 객체가 해당 클래스의 인스턴스(객체) 혹은 자식 클래스인지 비교

        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);
        boolean result2 = dog1 instanceof Animal;
        System.out.println(result2);
        boolean result3 = animal1 instanceof Dog;
        System.out.println(result3);

        Animal animal2 = new Dog();
//        ((Dog) animal2).wagTail();

        if (animal2 instanceof Dog) {
            Dog dog2 = (Dog) animal2;
            dog2.wagTail();
        } else {
            System.out.println("불가능한 다운 캐스팅");
        }

    }
}
