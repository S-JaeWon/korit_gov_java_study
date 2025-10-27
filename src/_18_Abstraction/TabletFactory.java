package _18_Abstraction;

public class TabletFactory extends Factory {
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 모델 태블릿 생산");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
