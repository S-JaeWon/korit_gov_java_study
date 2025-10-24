package _18_Abstraction;

public class TabletFactory extends Factory {
    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 모델 태블릿 생산");
    }

    @Override
    public void manage() {
        System.out.println("공장 관리");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드 합니다.");
    }
}
