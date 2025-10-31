package _27_Generic;

import lombok.Data;

@Data
public class ResponseData<T> {
    private String message;

    private T data;

    @Override
    public String toString() {
        return message + data;
    }

    //    public String toStringStr() {
//        return message + " : " + data1;
//    }
//
//    public String toStringInt() {
//        return message + " : " + data2;
//    }
//
//    public String toStringDouble() {
//        return message + " : " + data3;
//    }

    /*
    * 제네릭
    * 클래스나 메서드가 다룰 자료형을 미리 명시하여 재사용성과 유연성을 높임
    * 타입 매개변수
    * T(Type) -> 클래스 타입
    * E(Element) -> 컬렉션의 요소
    * K(Key) -> Map의 Key
    * V(Value) -> Map의 Value 혹은 제네릭타입의 반환값
    * */

}
