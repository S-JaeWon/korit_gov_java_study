package _18_Abstraction;

/*
* 추상화 -> 틀은 있지만 내용은 없음, 클래스나 메서드 만들때 사용
* 내용은 자식 클래스에서 생성
*
* 추상 클래스
* 객체를 생성x, 공통적인 기능의 틀만 존재
* 설계 일관성과 확장성 확보 -> 공통된 구조를 가진 자식 클래스 생성 가능
* 오류 방지 / 강제구현 -> 해당 기능을 구현하지 않으면 컴파일 에러 발생
*
* */
public abstract class Factory {
    private String factoryName;

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    // 추상 메서드 정의
    public abstract void produce(String model);

    public abstract void manage();

    // 일반 메서드도 사용 가능
    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다.");
        System.out.println("공장 이름: " + factoryName);
    }
}
