package _18_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.setFactoryName("갤럭시");
        phoneFactory.produce("S30");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        // 익명 클래스 -> 1회용 임시 클래스
        // 실직적으론 자식 클래스
        Factory factory = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getFactoryName() + " 공장");
            }

            @Override
            public void manage() {
                System.out.println(this.getFactoryName() + "관리");
            }
        };

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setFactoryName("애플");
        phoneFactory1.produce("17pro");

        TabletFactory tabletFactory = new TabletFactory();
        tabletFactory.setFactoryName("애플 태블릿");
        tabletFactory.produce("아이패드 미니 6세대");
        tabletFactory.upgrade("아이패드 미니 7세대");
        tabletFactory.manage();
        tabletFactory.displayInfo();
    }
}
