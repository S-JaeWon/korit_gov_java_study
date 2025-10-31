package _26_Singleton.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setApiKey("TEST_KEY_123");
        config.setAppMode("DEBUG");

        AppConfig config2 = AppConfig.getInstance();
        System.out.println(config2.getApiKey());
        System.out.println(config2.getAppMode());

        System.out.println(config == config2);
    }
}

/*
* 싱글톤 장점
* 1. 메모리 절약 -> 객체를 하나만 생성 후 재사용
* 2. 일관성 유지 -> 하나의 인스턴스를 공유
* 3. 전역 상태 관리 -> 객체를 전역으로 접근 가능
* 4. 자원 관리 -> DB와의 연결 객체는 여러개 있으면 관리가 어려워, 단 하나만 존재 해야함
*
* 단점
* 1. 테스트 어려움 -> 객체가 공유 되어 있기에 객체간 테스트x
* 2. 높은 결합도 -> 하나의 인스턴스를 공유하기에 다른 클래스에 영향을 줄 수 있다.
* */
