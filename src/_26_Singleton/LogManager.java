package _26_Singleton;

import lombok.extern.java.Log;

public class LogManager {
    // 싱글톤
    // 하나의 인스턴스만 공유 하는 패턴
    // 객체를 여러번 만들 필요가 없고, 한번만 만들고, 재사용
    // 객체 생성 없이 인스턴스를 담는 정적 변수

    private static LogManager instance;

    // 외부 객체 생성x
    private LogManager() {
        System.out.println("객체 생성");
    }

    public static LogManager getInstance() {
        if (instance == null) {
            instance = new LogManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }

}
