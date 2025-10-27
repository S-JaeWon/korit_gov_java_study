package _18_Abstraction;

public class PhoneFactory extends Factory {

    // ctrl + i
    // 추상 클래스를 상속 받으면 추상 메서드는 반드시 재정의 해줘야 함
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 모델 스마트폰 생산");
    }

}
