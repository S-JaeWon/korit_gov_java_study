package _21_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }
    // 자료형 같고, 매개변수 갯수가 같아서 오버로딩 x, schoolName을 가진 ReqArg생성자 생성x


    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return name + " 선생님의 " + schoolName + " 수업";
    }
    // 원래는 해시코드(참조주소)를 반환 했으나, 오버라이드를 통해 함수 재정의


    @Override
    public boolean equals(Object obj) { // Object 는 최상위 클래스
        if (this == obj) { // 비교하는 객체가 같은 메모리 주소라면 자기 자신 비교
            System.out.println("자기 자신과 비교");
            return true;
        }

        if (!(obj instanceof Teacher)) {
            return false;
        }

        // 인스턴스가 맞다면 (해당 클래스의 객체 혹은 자식 클래스)
        Teacher t = (Teacher) obj; // Object를 해당 클래스로 다운 캐스팅

        return this.name.equals(t.name) && this.schoolName.equals(t.schoolName);
    }
    // 두 객체의 참조 주소 비교 -> 파라미터 값 비교


    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName); // Objects 는 Object 와 달리 유틸성 클래스
    }

    // equals를 통해 같다 라고 판별된 개체는 해시코드가 같아야함
    // 그러므로 equals 재정의 -> hashcode 재정의 필수
    // 하지만 역일때는 필수 x
}
