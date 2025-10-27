package _19_Interface.TVRemoteController;

/*
* 인터페이스는 기능(메서드)의 명세(규칙, 약속)만 정의 하는 틀
* 추상클래스는 일반 메서드도 가능
* 인터페이스는 객체 생성 불가능
* 기능 중심 설계
* 여러 클래스에서 같은 행동을 다르게 구현할 때
* 다형성 극대화
* */

public interface Press {
    void onPressed();
}
